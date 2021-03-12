package ReadMongoData;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TestMain {

    public static void main(String[] args) {
        File file = new File("/Users/xujunmeng/Downloads/t_order_buffer.json");
        //合并后的json字段
        JSONObject result = new JSONObject();
        //冲突的json字段
        JSONObject conflict = new JSONObject();
        //字段类型
        JSONObject type = new JSONObject();

        int i = 0;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)))){
            String line = null;
            while ((line = reader.readLine()) != null){
                i++;
                JSONObject tmp = JSONObject.parseObject(line);

                merge(result , tmp ,type);
            }
        }catch (IOException e) {
            System.out.println(e);
        }

        for (Map.Entry<String, Object> stringObjectEntry : type.entrySet()) {
            List<Object> objectList = (List<Object>) stringObjectEntry.getValue();
            if(objectList.size() >= 2){
                conflict.put(stringObjectEntry.getKey() , stringObjectEntry.getValue());
            }
        }

        System.out.println("执行了数量"+i);
        System.out.println(result.toJSONString());
        System.out.println(conflict.toJSONString());
        System.out.println(type.toJSONString());
    }


    private static void merge(JSONObject result , JSONObject tmp ,JSONObject conflict){
        if(tmp == null){
            return;
        }

        for (Map.Entry<String, Object> stringObjectEntry : tmp.entrySet()) {

            //记录类型
            if(conflict.containsKey(stringObjectEntry.getKey()) ){
                List<Object> conflictClass = (List<Object>) conflict.get(stringObjectEntry.getKey());
                Object now = stringObjectEntry.getValue();

                boolean find = false;
                for (Object aClass : conflictClass) {
                    if(aClass.getClass() == now.getClass()){
                        find = true;
                        break;
                    }
                }

                if(!find){
                    conflictClass.add(now);
                    conflict.put(stringObjectEntry.getKey() ,conflictClass);
                }
            }

            //这些是动态变化的字段，不能量化，直接跳过（只统计一个key就行）
            if(!result.containsKey(stringObjectEntry.getKey()) && (stringObjectEntry.getKey().equals("paramStr") || stringObjectEntry.getKey().equals("std_tag_array"))){
                List<Object> conflictClass = new ArrayList<>();
                conflictClass.add(stringObjectEntry.getValue());
                conflict.put(stringObjectEntry.getKey() ,conflictClass);

                result.put(stringObjectEntry.getKey() , stringObjectEntry.getValue());
                continue;
            }

            //如果首次的value是空数组或空map的话，不能跳过
            if(result.containsKey(stringObjectEntry.getKey())){
                if(!((result.get(stringObjectEntry.getKey()) instanceof JSONArray && ((JSONArray) result.get(stringObjectEntry.getKey())).size() < 1) ||
                        (result.get(stringObjectEntry.getKey()) instanceof JSONObject && ((JSONObject) result.get(stringObjectEntry.getKey())).size() < 1))) {
                    continue;
                }
            }

            Object o = stringObjectEntry.getValue();
            if(o instanceof JSONArray && ((JSONArray) o).size() > 0){
                //首次如果是数组，记录记录类型，后续有相同的字段不在记录
                if(!result.containsKey(stringObjectEntry.getKey())){
                    List<Object> conflictClass = new ArrayList<>();
                    conflictClass.add(stringObjectEntry.getValue());

                    result.put(stringObjectEntry.getKey() , new JSONArray());
                    conflict.put(stringObjectEntry.getKey() ,conflictClass);
                }

                JSONArray array = (JSONArray) o;
                getJsonArrayObject(result , array, conflict);

            } else if(o instanceof JSONObject && ((JSONObject) o).size() > 0){
                //首次如果是map，记录记录类型，后续有相同的字段不在记录
                if(!result.containsKey(stringObjectEntry.getKey())){
                    List<Object> conflictClass = new ArrayList<>();
                    conflictClass.add( stringObjectEntry.getValue());

                    result.put(stringObjectEntry.getKey() , new JSONObject());
                    conflict.put(stringObjectEntry.getKey() ,conflictClass);
                }

                JSONObject obj = (JSONObject) o;
                merge(result , obj , conflict);

            } else if(!result.containsKey(stringObjectEntry.getKey())){
                //记录原始类型
                List<Object> conflictClass = new ArrayList<>();
                conflictClass.add(stringObjectEntry.getValue());
                conflict.put(stringObjectEntry.getKey() ,conflictClass);

                result.put(stringObjectEntry.getKey() , stringObjectEntry.getValue());
            }
        }
    }



    private static void getJsonArrayObject(JSONObject result , JSONArray array , JSONObject conflict){
        if(array.size() > 0) {
            for (Object o : array) {
                if(o instanceof JSONObject){
                    merge(result , (JSONObject) o , conflict);
                } else if(o instanceof JSONArray){
                    getJsonArrayObject(result , (JSONArray) o ,conflict);
                }
            }
        }
    }

}

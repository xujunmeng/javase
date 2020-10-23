package fastjson;

import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

public class TestMain {


    @Test
    public void test2() {
        Person person = new Person();
        person.setName("xianglj");
        person.setAge("20");
        person.setDesc("只是一个测试");

        System.out.println(person);


        String jsonStr = JSONObject.toJSONString(person);
        System.out.println("bean to json:" + jsonStr);

        //改变json的key为大写
//        jsonStr = jsonStr.toUpperCase();

        System.out.println("需要转换的json:" + jsonStr);
        person = JSONObject.toJavaObject(JSONObject.parseObject(jsonStr), Person.class);
        System.out.println("json to bean:" + person.getName());
    }

}

package 多个数组排列组合;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by james on 2018/3/29.
 */
public class Main2 {

    @Test
    public void aewras() {
        List<String> list = new ArrayList<>();
        list.add("12;22;32");
        list.add("43;53;63");
        list.add("744;84;94");
        List<String> result=combination(list);

        for (String string : result) {
            System.out.println(string);
        }
    }

    public static List<String> combination(List<String> inputList){
        List<String> resList = new ArrayList<>();
        String[] arr = new String[inputList.size()];
        combinationInt(inputList, resList, 0, arr);
        return resList;
    }

    private static void combinationInt(List<String> inputList, List<String> resList,
                                       int ind, String[] strList) {
        if (ind == inputList.size()) {
            StringBuilder sb = new StringBuilder();
            for(String temp : strList){
                sb.append(temp);
            }
            sb.append(";");
            resList.add(sb.toString());
            return;
        }
        for (String str : inputList.get(ind).split(";")){
            if (strList[ind] == null)
                strList[ind] = new String();
            strList[ind] = ";" + str;
            combinationInt(inputList, resList, ind + 1, strList);
        }
    }

}

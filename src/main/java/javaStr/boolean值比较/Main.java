package javaStr.boolean值比较;

import com.google.common.collect.Maps;
import org.junit.Test;

import java.util.Map;

/**
 * Created by james on 2018/5/30.
 */
public class Main {

    public static void main(String[] args) {

        Boolean a = false;
        if (Boolean.TRUE.equals(a)) {
            System.out.println("asd");
        }

    }

    @Test
    public void tessad() {

        String str = "三星 Galaxy S4";
        if (str.indexOf("其它") != -1 || str.indexOf("其他") != -1) {
            System.out.println("asdfasdf");
        }

    }

    @Test
    public void test2123() {
        Map<String, Integer> map = Maps.newHashMap();
        String a = "order_detail,3s00;request_list,300";
//        String a = "0";

        String[] strings = a.split(";");
        for (String str : strings) {
            String[] split = str.split(",");
            if (split.length > 1) {
                try {
                    map.put(split[0], Integer.valueOf(split[1]));
                } catch (Exception e) {

                }
            }
        }

        Integer q34r = map.get("q34r");
        System.out.println(q34r);


    }

}

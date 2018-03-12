package javaCollection.map.hashcode及equals相关;

import com.google.common.collect.Maps;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Administrator on 2017/5/17.
 */
public class EqualsTest {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();

        e1.setId(100);
        e2.setId(200);
        //Prints false in console
        System.out.println(e1.equals(e2));

        System.out.println("============================");


        Set<Employee> employees = new HashSet<>();
        employees.add(e1);
        employees.add(e2);
        //Prints two objects
        System.out.println(employees);

        System.out.println("===============================");

        HashMap<String, Employee> map = Maps.newHashMap();
        map.put("key1", e1);
        map.put("key1", e2);
        System.out.println(map);

    }
}

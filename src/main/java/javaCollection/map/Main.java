package javaCollection.map;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import javaCollection.map.hashcode及equals相关.Employee;
import org.junit.Test;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

/**
@author junmeng.xu
@date  2016年4月8日下午3:58:13
 */
public class Main {
	
	/**
	 * 循环出所有的key
	 */
	@Test
	public void testAllKeys(){
		Map<String, String> map = new HashMap<String, String>();
		map.put("12", "22");
		map.put("12", "22");
		map.put("14", "24");
		for (String string : map.keySet()) {
			System.out.println(string);
		}
		Collection<String> values = map.values();
		System.out.println(values);
	}
	
	/**
	 * 删除Map中一些键值对
	 */
	@Test
	public void test22(){
		Map<String, String> map = Maps.newHashMap();
		map.put("T005002008", "232");
		map.put("T005002009", "232");
		map.put("T005002011", "232");
		map.put("T005002012", "232");
		map.put("T005002020", "232");
		map.put("T005002021", "232");
		map.put("T0232008", "232");
		map.put("T0050232308", "232");
		map.put("T00523008", "232");
		map.put("T00123002008", "232");
		map.put("T002102008", "232");
		map.put("T005034008", "232");
        if(map.containsKey("T005002008")){
        	map.remove("T005002008");
        }
        if(map.containsKey("T005002009")){
        	map.remove("T005002009");
        }
        if(map.containsKey("T005002011")){
        	map.remove("T005002011");
        }
        if(map.containsKey("T005002012")){
        	map.remove("T005002012");
        }
        if(map.containsKey("T005002020")){
        	map.remove("T005002020");
        }
        if(map.containsKey("T005002021")){
        	map.remove("T005002021");
        }
        Set<Entry<String,String>> entrySet = map.entrySet();
        for (Entry<String, String> entry : entrySet) {
			System.out.println(entry);
		}
	}

	@Test
	public void test223(){
		Map<String, String> map = Maps.newHashMap();
		map.put("23", "asdf");
		map.put("232", "asdf");
		map.put("233", "asdf");
		map.put("24", "asdf");
		map.clear();
		System.out.println(map);
	}

	//判断map是否为null
	@Test
	public void tesd(){
		Map<String, String> map = Maps.newHashMap();
		System.out.println(map.isEmpty());
	}


	/**
	 * java8 toMap(Key重复java8自己的思路如何解决)
	 */
	@Test
	public void testmap () {
		List<Employee> list = Lists.newArrayList();
		Employee e1 = new Employee();
		e1.setId(1);
		e1.setFirstname("aa");
		Employee e2 = new Employee();
		e2.setId(2);
		e2.setFirstname("bb");
		Employee e3 = new Employee();
		e3.setId(1);
		e3.setFirstname("aa");
		Employee e4 = new Employee();
		e4.setId(4);
		e4.setFirstname("dd");
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		Map<Integer, Employee> map = list.stream().collect(Collectors.toMap(Employee::getId, (p) -> p, (v, v1)-> v));
		System.out.println(map);
	}

}

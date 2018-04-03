package javaCollection.map;

import com.google.common.collect.Maps;
import org.junit.Test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

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

}

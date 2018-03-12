package javaCollection.map;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author junmeng.xu
 * @date 2016年9月23日下午3:44:05
 */
public class Test1 {

	public static void main(String[] args) {

		String freq = "W";// W M Q

		LinkedHashMap<String, Double> map = Maps.newLinkedHashMap();
		map.put("2009-02-02", 0.014381);
		map.put("2009-02-03", 0.027016476057812596);
		map.put("2009-02-04", 0.023883983850810052);
		map.put("2009-02-05", -0.007390303262120922);
		map.put("2009-02-06", 0.04685559391188957);
		map.put("2009-02-09", 0.03652939610878793);
		map.put("2009-02-10", 0.03652939610878793);
		map.put("2009-02-11", 0.03652939610878793);
		map.put("2009-02-12", 0.03652939610878793);
		map.put("2009-02-13", 0.03652939610878793);
		map.put("2009-02-14", 0.03652939610878793);
		map.put("2009-02-15", 0.03652939610878793);
		map.put("2009-02-16", 0.03652939610878793);
		map.put("2009-02-17", 0.03652939610878793);
		map.put("2009-02-18", 0.03652939610878793);
		map.put("2009-02-19", 0.03652939610878793);
		map.put("2009-02-20", 0.03652939610878793);
		map.put("2009-02-21", 0.03652939610878793);
		map.put("2009-02-22", 0.03652939610878793);
		map.put("2009-02-23", 0.03652939610878793);
		map.put("2009-02-24", 0.03652939610878793);
		map.put("2009-02-25", 0.03652939610878793);
		map.put("2009-02-26", 0.03652939610878793);
		map.put("2009-02-27", 0.03652939610878793);

		Map<String, Set<Double>> result = deal(freq, map);

	}

	private static LinkedHashMap<String, Set<Double>> deal(String freq,
			LinkedHashMap<String, Double> map) {
		LinkedHashMap<String, Double> result = Maps.newLinkedHashMap();
		LinkedHashMap<String, Double> subresult = Maps.newLinkedHashMap();
		Integer period = dealFreq(freq);

		Set<Entry<String, Double>> entrySet = map.entrySet();
		int i = 1;
		for (Entry<String, Double> entry : entrySet) {
			String dt = entry.getKey();
			Double earn = entry.getValue();
			if (i < period) {
				subresult.put(dt, earn);
			}
		}

		return null;
	}

	private static Integer dealFreq(String freq) {
		if (StringUtils.equals("W", freq)) {
			return 7;
		} else if (StringUtils.equals("M", freq)) {
			return 30;
		} else if (StringUtils.equals("M", freq)) {
			return 180;
		}
		return null;
	}

	@Test
	public void test22() {
		LinkedHashMap<String, Double> map = Maps.newLinkedHashMap();
		map.put("2009-02-02", 0.014381);
		map.put("2009-02-03", 0.027016476057812596);
		map.put("2009-02-04", 0.023883983850810052);
		map.put("2009-02-05", -0.007390303262120922);
		map.put("2009-02-06", 0.04685559391188957);
		map.put("2009-02-09", 0.03652939610878793);
		map.put("2009-02-10", 0.03652939610878793);
		map.put("2009-02-11", 0.03652939610878793);
		map.put("2009-02-12", 0.03652939610878793);
		map.put("2009-02-13", 0.03652939610878793);
		map.put("2009-02-14", 0.03652939610878793);
		map.put("2009-02-15", 0.03652939610878793);
		map.put("2009-02-16", 0.03652939610878793);
		map.put("2009-02-17", 0.03652939610878793);
		map.put("2009-02-18", 0.03652939610878793);
		map.put("2009-02-19", 0.03652939610878793);
		map.put("2009-02-20", 0.03652939610878793);
		map.put("2009-02-21", 0.03652939610878793);
		map.put("2009-02-22", 0.03652939610878793);
		map.put("2009-02-23", 0.03652939610878793);
		map.put("2009-02-24", 0.03652939610878793);
		map.put("2009-02-25", 0.03652939610878793);
		map.put("2009-02-26", 0.03652939610878793);
		map.put("2009-02-27", 0.03652939610878793);

		List<String> apList = Lists.newArrayList("2009-02-06", "2009-02-11",
				"2009-02-18", "2009-02-24");

		Map<String, Set<Double>> result = Maps.newHashMap();

		Set<Entry<String, Double>> entrySet = map.entrySet();
		for (Entry<String, Double> entry : entrySet) {
			String dt = entry.getKey();
			Double earn = entry.getValue();
		}

	}

	@Test
	public void test3() {
		Map<String, Map<String, String>> result = Maps.newHashMap();
		
		
		
		Map<String, Map<String, String>> map = Maps.newHashMap();
		Map<String, String> entry = Maps.newHashMap();
		entry.put("aa", "222");
		entry.put("bb", "223");
		map.put("22", entry);
		
		Map<String, String> entry2 = Maps.newHashMap();
		entry2.put("cc", "333");
		entry2.put("dd", "334");
		map.put("33", entry2);

		Set<Entry<String, Map<String, String>>> entrySet = map.entrySet();
		for (Entry<String, Map<String, String>> entry3 : entrySet) {
			String key = entry3.getKey();
			Map<String, String> value = entry3.getValue();
			Set<Entry<String,String>> entrySet2 = value.entrySet();
			
			Map<String, String> asdf = Maps.newHashMap();
			
			for (Entry<String, String> entry4 : entrySet2) {
				String key2 = entry4.getKey();
				String value2 = entry4.getValue();
				if(key2.equals("bb")){
					continue;
				}
				asdf.put(key2, value2);
			}
			result.put(key, asdf);
		}
		System.out.println(result);

	}

	@Test
	public void test22223(){
		Map<String, String> map = Maps.newHashMap();
		map.put("12345", "aaa");
		map.put("12345", "bbb");
		map.put("12345", "ccc");
		map.put("12345", "ddd");
		System.out.println(map);

	}

}

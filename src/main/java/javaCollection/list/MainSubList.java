package javaCollection.list;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
@author junmeng.xu
@date  2016年4月7日下午4:20:29
 */
public class MainSubList {

	@Test
	public void test3() {
		List<Long> sets = new ArrayList<>();
		sets.add(32L);
		sets.add(45L);
		sets.add(23L);
		Object o = JSON.toJSON(sets);
		System.out.println(o);
	}

	@Test
	public void test(){
		List<String> sets = new ArrayList<>();
		sets.add("sdfsadf");
		sets.add("sdasdff");
		sets.add("sdxcf");
		sets.add("sdrf");
		sets.add("sdef");
		sets.add("sedf");
		sets.add("sdsdgf");
		sets.add("sdsdf");
		sets.add("sddsff");
		sets.add("s45df");
		sets.add("sdfdf");
		sets.add("sdyhf");
		sets.add("s43df");
		sets.add("sdhnf");
		sets.add("sdsdff");
		sets.add("sdhyf");
		List<String> strings = sets.subList(0, 5);
		System.out.println(strings);
	}

	@Test
	public void test5() {
		List<String> list = null;
		for (String s : list) {
			System.out.println(s);
		}

	}

	public static void main(String[] args) {
		
		Set<String> sets = new HashSet<String>();
		sets.add("");
		sets.add("sdfsadf");
		sets.add("sdasdff");
		sets.add("sdxcf");
		sets.add("sdrf");
		sets.add("sdef");
		sets.add("sedf");
		sets.add("sdsdgf");
		sets.add("sdsdf");
		sets.add("sddsff");
		sets.add("s45df");
		sets.add("sdfdf");
		sets.add("sdyhf");
		sets.add("s43df");
		sets.add("sdhnf");
		sets.add("sdsdff");
		sets.add("sdhyf");
		ArrayList<String> list = Lists.newArrayList(sets);
		if(list.get(0).equals("")){
			list.remove(0);
		}
		for (String string : list) {
			System.out.println(string);
		}
		int size = sets.size();
		int len = 3;
		int times = size % len == 0 ? size / len : (size / len + 1);
		for(int i = 1; i<= times ; i++){
			List<String> subList = list.subList((i - 1) * len, i == times ? size : i * len);
			for (String string : subList) {
				System.out.println(string);
			}
		}
		
	}
	
}

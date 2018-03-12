package javaCollection.sets;

import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

import org.junit.Test;

/**
@author junmeng.xu
@date  2016年5月13日上午9:59:42
 */
public class MainTreeSet {

	public static void main(String[] args) {
		
		TreeSet<String> set = new TreeSet<String>();
		set.add("-343");
		set.add("23");
		set.add("2");
		set.add("65");
		List<String> collect = set.stream().sorted((a, b) -> b.compareTo(a)).collect(Collectors.toList());
		for (String string : collect) {
			System.out.println(string);
		}
	}
	@Test
	public void testaa(){
		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(23);
		set.add(2);
		set.add(45);
		set.add(232);
		set.add(67);
		set.add(43);
		set.add(22);
		System.out.println(set);
	}
}

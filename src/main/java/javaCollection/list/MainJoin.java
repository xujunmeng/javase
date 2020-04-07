package javaCollection.list;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.common.collect.Sets.SetView;
import org.junit.Test;

import java.util.*;

/**
@author junmeng.xu
@date  2016年4月7日下午4:42:17
 */
public class MainJoin {

	@Test
	public void test2() {
		long time = new Date().getTime();

		Calendar ca = Calendar.getInstance();
		ca.setTime(new Date());
		// num为增加的天数，可以改变的
		ca.add(Calendar.DATE, 1);
		long caTime = ca.getTime().getTime();

		System.out.println(time);
		System.out.println(caTime);

	}

	@Test
	public void test2323() {
		List<Integer> list = Lists.newArrayList();
		list.add(234);
		list.add(232);
		list.add(2);
		Integer integer = list.stream().max(Integer::compareTo).get();
		System.out.println(integer);
	}

	@Test
	public void tset2342323() {
		Set<Integer> allSet = Sets.newHashSet();
		Set<Integer> set1 = Sets.newHashSet(12,34,12);
		allSet.addAll(set1);
		Set<Integer> set2 = Sets.newHashSet(12,35,35);
		allSet.addAll(set2);
		System.out.println(allSet);
	}

	public static void main(String[] args) {
		
		Set<String> set1 = new HashSet<String>();
		set1.add("123");
		set1.add("234");
		set1.add("345");
		set1.add("456");
		Set<String> set2 = new HashSet<String>();
		set2.add("234");
		set2.add("345");
		set2.add("456");
		set2.add("567");
		SetView<String> difference = Sets.difference(set1, set2);
		for (String string : difference) {
			System.out.println(string);
		}
	}

	@Test
	public void saer() {
		Set<Integer> test1 = Sets.newHashSet();
		test1.add(1);
		test1.add(2);
		test1.add(3);

		Set<Integer> test2 = Sets.newHashSet();
		test2.add(3);
		test2.add(4);
		test2.add(5);

		test1.addAll(test2);
		System.out.println(test1);
	}
	
}

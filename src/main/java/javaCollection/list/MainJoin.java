package javaCollection.list;

import java.util.*;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.common.collect.Sets.SetView;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

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
		List<String> list = Lists.newArrayList();
		list.add("234");

		String s = list.get(list.size() - 1);
		System.out.println(s);
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
	
}

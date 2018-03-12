package javaCollection.list;

import java.util.HashSet;
import java.util.Set;

import com.google.common.collect.Sets;
import com.google.common.collect.Sets.SetView;

/**
@author junmeng.xu
@date  2016年4月7日下午4:42:17
 */
public class MainJoin {

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

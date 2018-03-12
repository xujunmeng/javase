package javaCollection.sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.google.common.collect.Sets;

/**
@author junmeng.xu
@date  2016年3月28日上午10:52:04
 */
public class Main {

	public static void main(String[] args) {
		
//		testDifference();
		Set<String> s1 = new HashSet<String>();
		s1.add("11");
		s1.add("22");
		s1.add("33");
		Set<String> s2 = new HashSet<String>();
		s2.add("22");
		s2.add("44");
		s2.add("11");
		HashSet<String> newHashSet = Sets.newHashSet(Sets.union(s1, s2));
		Iterator<String> iterator = newHashSet.iterator();
		while(iterator.hasNext()){
			String next = iterator.next();
			System.out.println(next);
		}
		
	}

	private static void testDifference() {
		Set<String> s1 = new HashSet<String>();
		s1.add("11");
		s1.add("22");
		s1.add("33");
		Set<String> s2 = new HashSet<String>();
		s2.add("22");
		s2.add("44");
		s2.add("11");
		HashSet<String> newHashSet = Sets.newHashSet(Sets.difference(s1, s2));
		Iterator<String> iterator = newHashSet.iterator();
		while(iterator.hasNext()){
			String next = iterator.next();
			System.out.println(next);
		}
	}
	
}

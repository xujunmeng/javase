package javaCollection.list;

import java.util.ArrayList;
import java.util.List;

/**
@author junmeng.xu
@date  2016年4月18日下午4:05:16
 */
public class ListIsNull {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		List<String> list1 = new ArrayList<String>();
		list1.add("12");
		List<String> list2 = new ArrayList<String>();
		list2.add("12");
		
		if(list1 != null && !list1.isEmpty()){
			System.out.println("1");
		}
		if(list2 != null && !list2.isEmpty()){
			System.out.println("2");
		}
		
		if((list1 != null && !list1.isEmpty()) && (list2 != null && !list2.isEmpty())){
			System.out.println("3");
		}
		//list1 为空 list2 不为空
		if((list1 == null || list1.isEmpty()) && (list2 != null && !list2.isEmpty())){
			System.out.println("4");
		}
		//list1 不为空 list2 为空
		if((list1 != null && !list1.isEmpty()) && (list2 == null || list2.isEmpty())){
			System.out.println("5");
		}
		
	}
	
}

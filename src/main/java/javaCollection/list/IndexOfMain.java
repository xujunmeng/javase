package javaCollection.list;



import java.util.List;

import com.google.common.collect.Lists;

/**
@author junmeng.xu
@date  2016年6月13日上午9:51:09
 */
public class IndexOfMain {

	public static void main(String[] args) {
		
		List list = Lists.newArrayList("11","22","33","44","55","66","77","88");
		
		int indexOf = list.indexOf("55");
		
		System.out.println(indexOf);
		
		
		
	}
	
}

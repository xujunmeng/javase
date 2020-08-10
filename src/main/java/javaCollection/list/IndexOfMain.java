package javaCollection.list;



import com.google.common.collect.Lists;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;

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

	@Test
	public void test() {
		List<String> list = Lists.newArrayList("11","22","33","44","55","66","77","88", "asd", "");
		List<Integer> integers = list.stream()
				.filter(a -> StringUtils.isNumeric(a))
				.map(a -> Integer.valueOf(a)).collect(Collectors.toList());
		System.out.println(integers);
	}

	@Test
	public void test2() {
		String str = "2114,2452,6947,2026,10203,2014,2129,2126,2134,2808,2067,2023,6949,6982,2118,9507,2072,6944,2100,2108,10007,11018,2045,10129,2104,5300,";
		if (StringUtils.isNotEmpty(str)) {
			int i = str.length() - 1;
			if (StringUtils.equalsIgnoreCase(str.substring(i - 1), ",")) {

			}
		}
	}

	@Test
	public void test3() {
		Integer i = 3;
		boolean equals = i.equals(null);
		System.out.println(equals);
	}

}

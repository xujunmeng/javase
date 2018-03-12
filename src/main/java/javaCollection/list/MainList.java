package javaCollection.list;

import java.util.ArrayList;
import java.util.List;

/**
@author junmeng.xu
@date  2016年3月31日下午1:15:04
 */
public class MainList {

	public static void main(String[] args) {
		List<String> sids = new ArrayList<String>();
//		sids.add("12341233");
//		sids.add("12342123");
//		sids.add("12344123");
//		sids.add("12534123");
//		sids.add("12344123");
//		sids.add("1232344123");
//		sids.add("123454123");
//		sids.add("124534123");
//		sids.add("1234345123");
//		sids.add("123564123");
//		sids.add("1234673123");
//		sids.add("1245634123");
//		sids.add("1234534123");
//		sids.add("1234567123");
//		sids.add("1234657123");
//		sids.add("1236784123");
//		sids.add("1245634123");
//		sids.add("1237894123");
//		sids.add("123354123");
//		sids.add("12345634123");
//		sids.add("123478123");
//		sids.add("12345674123");
//		sids.add("12376894123");
//		sids.add("1456234123");
//		sids.add("1234126783");
//		sids.add("123456123");
		String substring = dealListToStr(sids);
		System.out.println(substring);
		
	}
	private static String dealListToStr(List<String> sids) {
		String strs = "";
		for (String string : sids) {
			strs += "'"+string+"',";
		}
		String substring = "("+strs.substring(0, strs.length()-1)+")";
		return substring;
	}
	
}

package javaStr.通用分隔符;

import com.google.common.collect.Lists;
import org.apache.commons.collections.CollectionUtils;
import org.junit.Test;

import java.util.List;

/**
@author junmeng.xu
@date  2016年8月22日下午4:29:44
 */
public class Main {

	public static void main(String[] args) {
		
		System.out.println(System.getProperty("file.separator"));
		
	}
	
	@Test
	public void test(){
		String date = "2015-02-25";
		String substring = date.replace("-", "").substring(4);
		String substring2 = date.replace("-", "").substring(3);
		System.out.println(substring);
		System.out.println(substring2);
	}
	
	@Test
	public void test22(){
		String str = "xujunmeng";
		String string = str.subSequence(0, 1).toString();
		String substring = str.substring(0, 1);
		System.out.println(string);
		System.out.println(substring);
	}

	@Test
	public void test234(){
		List<String> str = Lists.newArrayList("123");
		if(CollectionUtils.isEmpty(str)){
			System.out.println("empty !　");
		}else{
			String s = dealListToStr(str);
			System.out.println(s);
		}

	}
	private String dealListToStr(List<String> sids) {
		String strs = "";
		for (String string : sids) {
			strs += "'"+string+"',";
		}
		String substring = "("+strs.substring(0, strs.length()-1)+")";
		return substring;
	}
	
	/**
	 * 37-46行，标准化股票代码，
	 * 可查询base_stock获取tick-code映射Map，
	 * 在handler初始化时，生成这个map，
	 * 此处直接通过obSeccode0007去map检索匹配，这样可以避免接入脏数据。
	 */
	
	
}

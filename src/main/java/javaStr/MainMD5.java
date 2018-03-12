package javaStr;

import org.junit.Test;

import java.util.Date;

/**
@author junmeng.xu
@date  2016年5月6日下午3:52:56
 */
public class MainMD5 {

/*	public static void main(String[] args) {
		String md5 = MD5.md5("AKIAIZCH5LV4XJTDPJST" + "," + new Date().getTime() + "," + "3a8b60e68624815b");
		System.out.println(md5);
	}*/
	
	@Test
	public void test(){
		long time = new Date().getTime();
		System.out.println(time);
	}
}

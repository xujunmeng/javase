package Annotation.使用Annotation的例子.实例二;

import Annotation.使用Annotation的例子.实例一.Testable;

/**
@author junmeng.xu
@date  2016年8月18日下午3:25:42
 */
public class MyTest {

	//使用@Testable 标记注释指定该方法是可测试的
	@Testable
	public static void m1(){
		
	}
	
	public static void m2(){
		
	}
	
	//使用@Testable 标记注释指定该方法是可测试的
	@Testable
	public static void m3(){
		throw new RuntimeException("Boom");
	}
	
	public static void m4(){
		
	}
	
	//使用@Testable 标记注释指定该方法是可测试的
	@Testable
	public static void m5(){
		
	}
	
	public static void m6(){
		
	}
	
	//使用@Testable 标记注释指定该方法是可测试的
	@Testable
	public static void m7(){
		throw new RuntimeException("Crash");
	}
	
	public static void m8(){
		
	}
	
}

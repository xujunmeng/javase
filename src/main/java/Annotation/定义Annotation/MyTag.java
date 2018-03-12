package Annotation.定义Annotation;
/**
@author junmeng.xu
@date  2016年8月18日下午3:01:42
 */
public @interface MyTag {

	//定义了两个成员变量的Annotation
	//Annotation中的成员变量以方法的形式来定义
	String name() default "xujunmeng";
	int age() default 32;
	
}

package Annotation.使用Annotation的例子.实例一;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
@author junmeng.xu
@date  2016年8月18日下午3:17:20
 */

/**
 * @Retention 注释指定Testable注释可以保留多久，
 * @Target 注释指定能修饰的目标(只能是方法) 
 *  retention : 保持力
 *  policy : 策略
 */

//使用JDK的元数据Annotation:Retention
@Retention(RetentionPolicy.RUNTIME)

//使用JDK的元数据Annotation:Target
@Target(ElementType.METHOD)

//定义一个标记注释，不包含任何成员变量,即不可传入元数据
public @interface Testable {

}

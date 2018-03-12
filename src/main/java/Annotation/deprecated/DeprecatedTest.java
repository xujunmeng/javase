package Annotation.deprecated;
/**
@author junmeng.xu
@date  2016年8月18日下午2:46:46
 */

class Apple{
	//定义info方法已过时
	@Deprecated
	public void info(){
		System.out.println("Apple的info方法");
	}
}

public class DeprecatedTest {

	public static void main(String[] args) {
		
		//下面使用info方法时将会被编译器警告
		new Apple().info();
		
	}
	
}

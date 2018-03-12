package 练习的例子;
/**
@author junmeng.xu
@date  2016年10月20日下午5:13:40
 */
public class SubClass extends FatherClass{

	
	
	public void test2(){
		long aa = sadf;
		long asdfs = serialVersionUID;
		System.out.println(aa + ":" + asdfs);
	}
	
	public static void main(String[] args) {
		System.out.println("asdfasdf");
		new SubClass().test2();
	}
	
}
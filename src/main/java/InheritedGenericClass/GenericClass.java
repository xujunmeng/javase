package InheritedGenericClass;


/**
@author junmeng.xu
@date  2016年3月15日下午6:43:14
 */
public class GenericClass {
	
	public static void main(String[] args) {
		
		System.out.println("以泛型类为父类的实现方法如下 : ");
		Child<Double, String> cd = new Child<Double, String>(544.5, "当前系统的时间为:");
		System.out.println("\t" + cd.getDob());
		System.out.println(cd.getOb());
	}
	
}
class Child<T, U> extends Father<T>{
	U u;
	public Child(T t1, U u1){
		super(t1);
		u = u1;
	}
	public U getDob(){
		return u;
	}
}
class Father<T>{
	T t;
	public Father(T t){
		this.t = t;
	}
	public Father(){
		t = null;
	}
	public T getOb(){
		return t;
	}
}

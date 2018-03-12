package singleClass;
/**
@author junmeng.xu
@date  2016年5月18日上午9:38:52
 */
/**
 * 饿汉模式
 */
public class Main {

	private Main(){
		
	}
	private static Main m = new Main();
	
	public static Main getInstance(){
		return m;
	}
	
	public static void main(String[] args) {
		
		Main instance = Main.getInstance();
		Main instance2 = Main.getInstance();
		System.out.println(instance.equals(instance2));
		NN n1 = new NN();
		NN n2 = new NN();
		System.out.println(n1.equals(n2));
		
		
		
		
	}
	
}

class NN{
	
}

class MM{
	private MM(){
		
	}
	private static MM mm = new MM();
	
	private static MM getInstance(){
		return mm;
	}
}























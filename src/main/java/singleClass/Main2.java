package singleClass;

import java.util.HashSet;
import java.util.Set;
/**
@author junmeng.xu
@date  2016年5月18日上午9:42:21
 */
/**
 * 懒汉模式
 */
public class Main2 implements Runnable {
	
	
	private Main2(){
		
	}
	private static Main2 m2 = null;
	
	public static Main2 getInstance(){
		if(null == m2){
			m2 = new Main2();
		}
		return m2;
	}
	Set<Main2> set = new HashSet<Main2>();
	@Override
	public void run() {
		while(true){
			set.add(getInstance());
			System.out.println(set);
		}
	}
	
	public static void main(String[] args) {
		Main2 main2 = new Main2();
		Thread t1 = new Thread(main2);
		Thread t2 = new Thread(main2);
		Thread t3 = new Thread(main2);
		Thread t4 = new Thread(main2);
		Thread t5 = new Thread(main2);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
	}
}



class Main22{
	private Main22(){
		
	}
	private static Main22 m22 = null;
	
	public static Main22 getInstance(){
		if(null == m22){   //这里会有线程安全
			m22 = new Main22();
		}
		return m22;
	}

}

















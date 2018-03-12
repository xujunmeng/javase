package javafor;
/**
@author junmeng.xu
@date  2016年4月6日下午6:15:47
 */
public class Main {

	public static void main(String[] args) {
		
		for(int i = 0 ; i < 200 ; i++){
			System.out.println("befor");
			add(i);
			continue;
		}
		
	}

	private static void add(int i) {
		if(i == 5){
			return;
		}
		
	}
	
}

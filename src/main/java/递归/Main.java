package 递归;

import java.util.ArrayList;

import org.junit.Test;

import com.google.common.collect.Lists;

/**
@author junmeng.xu
@date  2016年6月21日下午5:11:30
 */
public class Main {

	public static void main(String[] args) {
		
		System.out.println(fn(10));
		
	}
	public static int fn(int n){
		if(n == 0) return 1;
		else if(n == 1) return 4;
		else return 2 * fn(n-1) + fn(n-2);
	}
	
	
	
	@Test
	public void test1(){
		ArrayList<Integer> aList = Lists.newArrayList();
		int a1 = 2;
		aList.add(a1);
		for (int i = 2; i <= 14; i++) {
			int temp = aList.get(i-2)*3;
			aList.add(temp);
		}
		System.out.println(aList);
		System.out.println(aList.size());
	}
	
	
	
	
	
	
}

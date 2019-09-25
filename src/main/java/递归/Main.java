package 递归;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.ArrayList;

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
	
	@Test
	public void w3sdf() {
		test(10);
	}

	public static void test(int n) {
		if (n > 2) {
			test(n - 1);
		}
		System.out.println("n = " + n);
	}

	/**
	 * 在n个球中取m个球，有多少种不同的取法
	 */
	@Test
	public void sadfasd() {
		int k = f(3,1);
		System.out.println(k);
	}

	public static int f(int n,int m){
		if (n < m) {
			return 0;
		}
		if (n == m) {
			return 1;
		}
		if (m == 0) {
			return 1;
		}
		return f(n-1, m-1)+f(n - 1, m);
	}

	/**
	 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级，跳3个，4个......n-1个。
	 * 求该青蛙跳上一个n级的台阶总共有多少种跳法
	 */
	@Test
	public void  asdf23() {
		int i = jumpII(3);
		System.out.println(i);
	}


	public int jumpII(int target){
		if(target==0){
			return 0;
		}else if(target== 1){
			return 1;
		}else if(target== 2){
			return 2;
		}else{
			int[] array = new int[target+1];
			array[0]=0;
			array[1]=1;
			array[2]=2;
			int sum = 3;
			for(int i=3;i<array.length;i++){
				array[i]=sum+1;
				sum = sum+array[i];
			}
			return array[target];
		}

	}
}

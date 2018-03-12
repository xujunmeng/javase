package javaMath;

import org.junit.Test;

/**
@author junmeng.xu
@date  2016年7月26日下午3:12:02
 */
public class DoubleMain {

	@Test
	public void test(){
		double parseDouble = Double.parseDouble("0.0002");
		System.out.println(parseDouble);
	}

	@Test
	public void test2(){
		String str = "NA";
		Double v = Double.parseDouble(str);
		boolean naN = v.isNaN();
		System.out.println(naN);

	}

	@Test
	public void tset3(){
		Double d1 = 1d;
		Double d2 = 1.00d;
		int i = d1.compareTo(d2);
		System.out.println(i);
	}
	
}

package random;

import org.junit.Test;

import java.util.Random;

/**
@author junmeng.xu
@date  2016年2月25日下午6:34:42
 */
public class Main {

	public static void main(String[] args) {
		Random random = new Random();
		String str = Long.toString(System.currentTimeMillis()) + "." + random.nextInt(100);
		System.out.println(str);
	}


	private static int generateCount = 0;
	public static synchronized String getUniqueString()
	{
		if(generateCount > 99999)
			generateCount = 0;
		String uniqueNumber = Long.toString(System.currentTimeMillis()) + Integer.toString(generateCount);
		generateCount++;
		return uniqueNumber;
	}

	@Test
	public void test(){
		while(true){
			String s = getUniqueString();
			System.out.println(s);
		}
	}


}

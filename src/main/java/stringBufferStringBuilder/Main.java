package stringBufferStringBuilder;

import org.junit.Test;

/**
@author junmeng.xu
@date  2016年8月16日上午10:25:34
 */
public class Main {

	public static void main(String[] args) {
		
		//效率太低，可以看博客
		String string = "";
		for(int i = 0 ; i < 10000 ; i++){
			string += "hello";
		}
		
	}
	
	@Test
	public void test2(){
		StringBuilder stringBuilder = new StringBuilder();
		for(int i = 0 ; i < 10000 ; i++){
			stringBuilder.append("hello");
		}
	}
	
}

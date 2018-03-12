package optional;

import java.util.Optional;

import org.junit.Test;

/**
@author junmeng.xu
@date  2016年9月29日下午5:35:10
 */
public class Main {

	
	@Test
	public void test2(){
		Double dd = null;
		Double orElse = Optional.ofNullable(dd).orElse(Double.NaN);
		System.out.println(orElse);
	}
	
}

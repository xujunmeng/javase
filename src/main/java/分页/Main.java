package 分页;

import com.google.common.collect.Lists;
import org.apache.commons.lang3.ObjectUtils;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
@author junmeng.xu
@date  2016年7月13日下午3:44:19
 */
public class Main {

	static ExecutorService executor = Executors.newFixedThreadPool(20);
	
	public static void main(String[] args) {
		
		List<String> list = Lists.newArrayList();
		//向list存放数据，对这个数据进行分页
		int size = list.size();
		int head = 0;
		int times = size / 900 + (size % 900 == 0 ? 0 : 1);
		List<Callable<Integer>> calls = new ArrayList<>();
		for (int i = 0; i < times; i++) {
			int end = head + 900;
			
			if(end > size) end = size;
			
			List<String> subSids = list.subList(head, end);
			Callable<Integer> callable = () -> {
                //处理subSids的程序
                return null;
            };
			calls.add(callable);
			head += 900;
		}
    	int total = 0;
    	try {
			List<Future<Integer>> futures = executor.invokeAll(calls);
			for (Future<Integer> future : futures) {
				total += future.get();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void werwe(){
		Collection<String> cloo = Lists.newArrayList("23","4","54","12","65","63");
		Object[] array = cloo.toArray();
		Object[] array1 = new Object[3];
		
		System.arraycopy(array, 0, array1, 0, 3);
		
		for(Object o : array1){
			System.out.println(o);
		}
		
	}


	@Test
	public void test2() {
		if (2 != 2 || 2 != 2|| 385 != 385) {
			System.out.println("sdf");
		}

		Integer a0 = new Integer(1);// 普通的堆中对象
		Integer b0 = new Integer(1);
		boolean equals = ObjectUtils.equals(a0, b0);
		System.out.println(equals);
		if (a0.intValue() != b0.intValue()) {
			System.out.println("xcc");
		}
	}
	
	
}

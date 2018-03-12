package 练习的例子;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


import com.google.common.collect.Lists;
import org.apache.commons.lang3.ObjectUtils;

/**
@author junmeng.xu
@date  2016年9月18日下午4:18:55
 */
public class Main {

	static ExecutorService executor = Executors.newFixedThreadPool(20);
	
	public static void main(String[] args) throws Exception {
		
		Calendar startCalendar = Calendar.getInstance();
		Calendar endCalendar = Calendar.getInstance();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		startCalendar.setTime(df.parse("2007-01-01"));
		endCalendar.setTime(df.parse("2015-12-04"));
		ArrayList<String> list = Lists.newArrayList();
		while(true){
			startCalendar.add(Calendar.DAY_OF_MONTH, 1);
			if(startCalendar.getTimeInMillis() < endCalendar.getTimeInMillis()){
				// 转数组或是集合
				list.add(df.format(startCalendar.getTime()));
			}else{
				break;
			}
		}
		
		//向list存放数据，对这个数据进行分页
		int size = list.size();
		int head = 0;
		int times = size / 50 + (size % 50 == 0 ? 0 : 1);
		List<Callable<Integer>> calls = new ArrayList<Callable<Integer>>();
		for (int i = 0; i < times; i++) {
			int end = head + 50;
			
			if(end > size) end = size;
			
			List<String> subSids = list.subList(head, end);
			Callable<Integer> callable = new Callable<Integer>() {

				@Override
				public Integer call() throws Exception {
					System.out.println(subSids);
					return null;
				}
				
			};
			calls.add(callable);
			head += 50;
		}
    	int total = 0;
    	try {
			List<Future<Integer>> futures = executor.invokeAll(calls);
			for (Future<Integer> future : futures) {
				if(ObjectUtils.notEqual(null, future)){
					Integer count = future.get();
					if(ObjectUtils.notEqual(null, count)){
						total = total + count;
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	
}

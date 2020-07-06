package javaCollection.map;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import javaCollection.map.hashcode及equals相关.Employee;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Map.Entry;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
@author junmeng.xu
@date  2016年4月8日下午3:58:13
 */
public class Main {
	
	/**
	 * 循环出所有的key
	 */
	@Test
	public void testAllKeys(){
		Map<String, String> map = new HashMap<String, String>();
		map.put("12", "22");
		map.put("12", "22");
		map.put("14", "24");
		for (String string : map.keySet()) {
			System.out.println(string);
		}
		Collection<String> values = map.values();
		System.out.println(values);
	}
	
	/**
	 * 删除Map中一些键值对
	 */
	@Test
	public void test22(){
		Map<String, String> map = Maps.newHashMap();
		map.put("T005002008", "232");
		map.put("T005002009", "232");
		map.put("T005002011", "232");
		map.put("T005002012", "232");
		map.put("T005002020", "232");
		map.put("T005002021", "232");
		map.put("T0232008", "232");
		map.put("T0050232308", "232");
		map.put("T00523008", "232");
		map.put("T00123002008", "232");
		map.put("T002102008", "232");
		map.put("T005034008", "232");
        if(map.containsKey("T005002008")){
        	map.remove("T005002008");
        }
        if(map.containsKey("T005002009")){
        	map.remove("T005002009");
        }
        if(map.containsKey("T005002011")){
        	map.remove("T005002011");
        }
        if(map.containsKey("T005002012")){
        	map.remove("T005002012");
        }
        if(map.containsKey("T005002020")){
        	map.remove("T005002020");
        }
        if(map.containsKey("T005002021")){
        	map.remove("T005002021");
        }
        Set<Entry<String,String>> entrySet = map.entrySet();
        for (Entry<String, String> entry : entrySet) {
			System.out.println(entry);
		}
	}

	@Test
	public void test223(){
		Map<String, String> map = Maps.newHashMap();
		map.put("23", "asdf");
		map.put("232", "asdf");
		map.put("233", "asdf");
		map.put("24", "asdf");
		map.clear();
		System.out.println(map);
	}

	//判断map是否为null
	@Test
	public void tesd(){
		Map<String, List<String>> map = Maps.newHashMap();
		List<String> strings = map.get("2342");
		List<String> collect = strings.stream().filter(a -> a.equals("2w3")).collect(Collectors.toList());
		System.out.println(collect);
	}


	/**
	 * java8 toMap(Key重复java8自己的思路如何解决)
	 */
	@Test
	public void testmap () {
		List<Employee> list = Lists.newArrayList();
		Employee e1 = new Employee();
		e1.setId(1);
		e1.setFirstname("aa");
		Employee e2 = new Employee();
		e2.setId(8);
		e2.setFirstname("bb");
		Employee e3 = new Employee();
		e3.setId(3);
		e3.setFirstname("aa");
		Employee e4 = new Employee();
		e4.setId(4);
		e4.setFirstname("dd");
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);

		Map<String, List<Employee>> collect = list.stream().sorted((a, b) -> b.getId().compareTo(a.getId())).collect(Collectors.groupingBy(a -> a.getFirstname()));
		for (Entry<String, List<Employee>> entry : collect.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());

		}


//		Integer id = list.stream().filter(a -> a.getId() != null).max(Comparator.comparing(Employee::getId)).get().getId();
//		System.out.println(id);
//
//		int sum = list.stream().mapToInt(a -> a.getId()).sum();
//		System.out.println(sum);
//
//		Map<Integer, Employee> map = list.stream().collect(Collectors.toMap(Employee::getId, (p) -> p, (v, v1)-> v));
//		System.out.println(map);
	}

	@Test
	public void test2() {
		Map<String, String> map = Maps.newHashMap();
		map.put("a", "aVal");
		map.put("b", "bVal");
		map.put("c", "cVal");
		map.put("d", "dVal");
		String aaa = map.computeIfAbsent("a", k -> new String());
		System.out.println(aaa);
	}

	@Test
	public void rsersef() {
		Integer a = 2;
		Integer b = 2;

		if (a == null || a.intValue() != b.intValue()) {
			System.out.println("asdf");
		}
	}

	@Test
	public void w3rsdf() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Calendar beforeTime = Calendar.getInstance();
		beforeTime.add(Calendar.MINUTE, 10);
		Date beforeDate = beforeTime.getTime();
		Date now = new Date();
		System.out.println(beforeDate);
		System.out.println(now);
	}

	@Test
	public void dfsaf() {
		boolean numeric = isNumeric("yud");
		System.out.println(numeric);
	}

	public static boolean isNumeric(String str){
		Pattern pattern = Pattern.compile("[0-9]*");
		return pattern.matcher(str).matches();
	}

	@Test
	public void asef2w3(){
		Date deadline = compareDate();
		deadline = addHour(deadline, 4);
		if (compareDate(deadline)) {
			deadline = addHour(deadline, 6);
		}
		System.out.println(deadline);
	}

	public static Date compareDate() {
		Calendar beforeTime = Calendar.getInstance();
		beforeTime.add(Calendar.HOUR, 6);
		Date date = beforeTime.getTime();

		Calendar todayStart = Calendar.getInstance();
		todayStart.set(Calendar.HOUR_OF_DAY, 0);
		todayStart.set(Calendar.MINUTE, 0);
		todayStart.set(Calendar.SECOND, 0);
		todayStart.set(Calendar.MILLISECOND, 0);

		Calendar todayEnd = Calendar.getInstance();
		todayEnd.set(Calendar.HOUR_OF_DAY, 6);
		todayEnd.set(Calendar.MINUTE, 0);
		todayEnd.set(Calendar.SECOND, 0);
		todayEnd.set(Calendar.MILLISECOND, 0);

		if (date.getTime() >= todayStart.getTimeInMillis() && date.getTime() <= todayEnd.getTimeInMillis()) {
			return todayEnd.getTime();
		}
		return date;
	}

	public static boolean compareDate(Date date){

		Calendar todayStart = Calendar.getInstance();
		todayStart.set(Calendar.HOUR_OF_DAY, 23);
		todayStart.set(Calendar.MINUTE, 59);
		todayStart.set(Calendar.SECOND, 59);
		todayStart.set(Calendar.MILLISECOND, 0);

		if (date.getTime()>todayStart.getTimeInMillis()) return true;
		return false;
	}

	public static Date addHour(Date date, int hour) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.HOUR, hour);
		return calendar.getTime();
	}

	@Test
	public void hashmapTest() throws InterruptedException {
		HashMap<String, String> map = new HashMap<>(2);

		Thread t = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 10000; i++) {
					new Thread(new Runnable() {
						@Override
						public void run() {
							map.put(UUID.randomUUID().toString(), "");
						}
					}, "ftf" + 1).start();
				}
			}
		}, "ftf");
		t.start();
		t.join();
	}

}

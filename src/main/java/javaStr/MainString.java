package javaStr;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import java.math.BigInteger;
import java.text.MessageFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author junmeng.xu
 * @date 2016年4月7日下午6:21:27
 */
public class MainString {

	public static void main(String[] args) {

		String str = ",2323,2323,2323";
		String str2 = "2015-01-05000007";
		int m = 1;
		for (int i = 0; i < 1000; i++) {
		}
	}

	@Test
	public void tset2sd34() {
		System.out.println((0 & 2) == 2);
	}

	@Test
	public void serw3() {
		List<Integer> integers = stringToIntegerList("101;201;", ";");
		System.out.println(integers);
	}

	@Test
	public void decodeHEX() {
		String hexs = "a";
		BigInteger bigInteger = new BigInteger(hexs, 16);
		int i = bigInteger.intValue();
		System.out.println(i);
	}

	public static List<Integer> stringToIntegerList(String str, String separator) {
		if (StringUtils.isEmpty(str)) {
			return new ArrayList<>();
		}
		List<Integer> resultList = new ArrayList<>();
		String[] lists = str.split(separator);
		for (String list : lists) {
			resultList.add(Integer.valueOf(list));
		}
		return resultList;
	}

	@Test
	public void setr213() {
		String str = "";
		System.out.println(str == null || "".equals(str));
	}

	@Test
	public void ser5wsr() {
		List<String> list = Lists.newArrayList("q2w34");
		Map<String, Integer> map = list.stream().collect(Collectors.toMap(a -> a.toString(), null, (v, v1) -> v));
		System.out.println(map);

	}

	@Test
	public void test2423() {
		String str = " h ell o ";
		String str2 = str.replaceAll(" ", "");
		System.out.println(str2);
	}

	@Test
	public void setser23() {
		StringBuilder quotationNames = new StringBuilder("test,");
		String substring = quotationNames.substring(0, (quotationNames.length() - 1));
		System.out.println(substring);
	}

	@Test
	public void set22(){
		int i = 10;
		i += 2;
		System.out.println(i);
	}

	@Test
	public void sdfasdf() {

		Integer Silver_Member = 2;

		Date deadline = compareDate();

		deadline = addHour(deadline, Silver_Member);
		if (compareDate(deadline)) {
			deadline = addHour(deadline, 6);
		}

		System.out.println(deadline);
	}

	public static Date addHour(Date date, int hour) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.HOUR, hour);
		return calendar.getTime();
	}

	@Test
	public void ser234() throws ParseException {
		String string = "2019-04-09 23:59:06";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date parse = sdf.parse(string);

		//Date date = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(parse);
		calendar.add(Calendar.HOUR, 1);
		System.out.println(calendar.getTime());
	}

	public static boolean compareDate(Date date){

		Calendar todayStart = Calendar.getInstance();
		todayStart.set(Calendar.HOUR_OF_DAY, 23);
		todayStart.set(Calendar.MINUTE, 59);
		todayStart.set(Calendar.SECOND, 59);
		todayStart.set(Calendar.MILLISECOND, 0);

		if (date.getTime()>todayStart.getTimeInMillis()) {
			return true;
		}
		return false;
	}

	@Test
	public void we4r3w() {
		List<Integer> integers = tset32();
		System.out.println(integers);
	}

	@Test
	public void ws3ers() {

		Integer quantity = null;
		quantity = null != quantity ? quantity : 0;
		System.out.println(quantity);
	}

	public List<Integer> tset32() {
		String phenomenonValueUnits = ";162;256;";
		if(phenomenonValueUnits == null){
			return new ArrayList<>();
		}
		List<Integer> phenomenonValueUnitStrs = new ArrayList<>();
		for(String property : phenomenonValueUnits.split(";")){
			if(property!=null && !property.equals("")){
				phenomenonValueUnitStrs.add(Integer.parseInt(property));
			}
		}
		return phenomenonValueUnitStrs;
	}

	public static Date compareDate() {
		Date date = new Date();

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


	@Test
	public void asdfsdf() {
		List<Integer> productProperties = Lists.newArrayList(3);


		List<List<Integer>> properties = Lists.newArrayList();
		List<Integer> list1 = Lists.newArrayList(1,2,3);
		properties.add(list1);

		for (List<Integer> property : properties) {
			property.retainAll(productProperties);
			System.out.println(property);
		}
	}

	@Test
	public void w3ersf() {
		List<Integer> list1 = Lists.newArrayList(1,2,3);
		list1.remove(1);
		System.out.println(list1);
	}

	@Test
	public void testw3e23() {
		Map<String, Integer> map = Maps.newHashMap();
		ArrayList<Integer> integers = Lists.newArrayList(map.values());
		System.out.println(integers);

	}

	@Test
	public void asaser() {
		List<Integer> list1 = Lists.newArrayList(1,2,3);
		List<Integer> list2 = Lists.newArrayList(4,5,6);
		sign:
		for (Integer a : list1) {
			for (Integer b : list2) {
				if (b.intValue() == 5) {
					continue sign;
				}
			}

		}

	}

	@Test
	public void test() {
		String str = "/announce/cn/20160408/f3edcf1aab5b73d9c7370aa3fc22f83e.pdf";
		String[] split = str.split("/");
		String string = split[split.length - 2];
		System.out.println(string);
	}

	// join
	@Test
	public void testJoin() {
		String str = "20160408";
		String str2 = "20160409";
		String str3 = "20160508";
		String str4 = "20160509";
		String str5 = "20150508";
		String str6 = "20150509";
		Set<String> set = new HashSet<String>();
		set.add(str);
		set.add(str2);
		set.add(str3);
		set.add(str4);
		set.add(str5);
		set.add(str6);
		System.out.println(StringUtils.join(set, ","));
	}

	@Test
	public void testJoin2() {
		int a = 10;
		String sum = "";
		for (int i = 0; i < a; i++) {
			sum = sum + "?,";
		}
		String substring = sum.substring(0, sum.length() - 1);
		System.out.println(substring);
	}

	@Test
	public void test2() {
		String str = "20160408";
		String str2 = "20160409";
		String str3 = "20160508";
		String str4 = "20160509";
		String str5 = "20150508";
		String str6 = "20150509";
		Set<String> set = new HashSet<String>();
		set.add(str);
		set.add(str2);
		set.add(str3);
		set.add(str4);
		set.add(str5);
		set.add(str6);
		Object[] array = set.stream().sorted().toArray();
		for (Object object : array) {
			System.out.println(object);
		}
		System.out.println("=========");
		System.out.println(array[0]);
		System.out.println(array[array.length - 1]);

	}

	@Test
	public void test3() throws ParseException {
		String date = "Apr 10, 2016 2:37:47 PM";
		SimpleDateFormat sdf = new SimpleDateFormat("MMM dd yyyy HH:mm:ss zz",
				Locale.US);

		Date d = sdf.parse(date);

		sdf = new SimpleDateFormat("yyyyMMdd");

		System.out.println(sdf.format(d));

	}

	@Test
	public void tesdf(){
		String str = "354151||351531||351135";
		boolean contains = str.contains("||");
		System.out.println(contains);
		String[] split = str.split("\\|\\|");
		for (String s : split) {
			System.out.println(s);
		}

	}

	@Test
	public void test4() {
		List<String> list = new ArrayList<String>();
		list.add("asdf");
		list.add("234");
		String join = String.join(",", list);
		System.out.println(join);
	}

	@Test
	public void test5() {
		Object arr[] = new Object[] { "1234" };
		Object string = arr[0];
		int parseInt = Integer.parseInt((String) string);
		int begin = parseInt - 1;
		int end = parseInt + 1;
		System.out.println(parseInt);
		System.out.println(begin);
		System.out.println(end);
		System.out.println(arr.length);
	}

	@Test
	public void test6() {
		String str = "2015-05-08";
		String[] split = str.split("-");
		String string = split[2];
		int a = Integer.parseInt(string) + 1;
		System.out.println(a);
	}

	@Test
	public void test7() {
		int nextInt = new Random().nextInt(99999);
		System.out.println(nextInt);
	}

	@Test
	public void test8() {
		List<Access> list = new ArrayList<Access>();
		Access a1 = new Access();
		a1.setAge(1);
		a1.setName("7686784589");
		Access a2 = new Access();
		a2.setAge(2);
		a2.setName("34334589");
		Access a3 = new Access();
		a3.setAge(3);
		a3.setName("123456789");
		list.add(a1);
		list.add(a2);
		list.add(a3);
		List<String> list2 = list.stream().map((a) -> a.getName())
				.collect(Collectors.toList());
		String join = StringUtils.join(list2, ",");
		System.out.println(join);
	}

	@Test
	public void test9() {
	}

	public static boolean equals(Object object1, Object object2) {
		if (object1 == object2) {
			return true;
		}
		if ((object1 == null) || (object2 == null)) {
			return false;
		}
		return object1.equals(object2);
	}

	/**
	 * 大于的情况：结果可能是1也可能是2 小于的情况：结果可能是-1也可能是-2 所以应该用 >0 =0 <0 来表示三种情况
	 */
	@Test
	public void test10() {
		String str1 = "2000-01-01";
		String str2 = "2000-01-01";
		int compareTo = str2.compareTo(str1);
		System.out.println(compareTo);
	}

	// subSequence
	@Test
	public void test11() {
		String y = "2001-05-20";
		String month = y.subSequence(5, 7).toString();
		String day = y.subSequence(8, 10).toString();
		System.out.println(month);
		System.out.println(day);
	}

	@Test
	public void sss() {
		boolean flag = false && false;
		System.out.println(flag);
	}

	@Test
	public void testsubString() {
		String str = "002054_SZ_EQ";
		int length = str.length();
		String substring = str.substring(length-4, length);
		System.out.println(substring);

	}

	@Test
	public void ser23() {
		Date date = new Date();
		String format = MessageFormat.format("收货时间 : {0}", getTimeStampStr(date));
		System.out.println(format);
	}

	public static final SimpleDateFormat LONG_DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	/**
	 * 得到时间戳格式字串
	 *
	 * @param date
	 * @return
	 */
	public static String getTimeStampStr(Date date) {
		return LONG_DATE_FORMAT.format(date);
	}

	@Test
	public void adsfASDF() {
		Integer a = 1;
		String result = a != null && a == 1 ? "as" : "asdf";
		System.out.println(result);
	}



	@SuppressWarnings("unused")
	@Test
	public void test223sdx5() {
		Object str = null;
		// Object str = "";
		if (str != null && str != "") {
			System.out.println(Double.valueOf(str.toString()));
		}
	}

	@Test
	public void test222() {
		String str1 = "aihuishou";
		String str2 = str1;
		String str3 = new String("aihuishou");
		String str4 = new String("aihuishou");
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		System.out.println(str3 == str4);
		System.out.println (str1.equals(str4));
	}

	@Test
	public void test2232(){
		boolean anyEmpty = isAnyEmpty("asdf", null);
		System.out.println(anyEmpty);
	}

	@Test
	public void testses() {
		String str = "其他手机";
		int i = str.indexOf("其他");
		System.out.println(i);
	}

	/**
	 * 字符的替换
	 * @param
	 * @return
	 */
	@Test
	public void test2323g(){
		String str = "UM(N1) = IF(CLOSE-CLOSE[N1]>0,CLOSE-CLOSE[N1],0)\nDM(N1) = IF(CLOSE-CLOSE[N1]<0,CLOSE[N1]-CLOSE,0)\nUA(N2) = (UA[1]*(N2-1)+UM)/N2\nDA(N2) = (DA[1]*(N2-1)+DM)/N2\nRMI = 100*(UA/(UA+DA))\nUA初始值 = SMA(UM,N)\nDA初始值 = SMA(DM,N)\n分母为0， IMI=50\n";
		String str2 = null;
		String replace = Optional.ofNullable(str2).orElse("").replace("\n", "<br>");
		System.out.println(replace);
	}

	public static boolean isAnyEmpty(final CharSequence... css) {
		if (ArrayUtils.isEmpty(css)) {
			return true;
		}
		for (final CharSequence cs : css) {
			if (isEmpty(cs)) {
				return true;
			}
		}
		return false;
	}

	public static boolean isEmpty(final CharSequence cs) {
		return cs == null || cs.length() == 0;
	}

	public class Access {
		private String name;
		private Integer age;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Integer getAge() {
			return age;
		}

		public void setAge(Integer age) {
			this.age = age;
		}

		@Override
		public String toString() {
			return "Access [name=" + name + ", age=" + age + "]";
		}

	}

	@Test
	public void tset234() {
//		String dbLogisticsSerialNo = "FI2017122814154620520404";
		String dbLogisticsSerialNo = "FI20171228141645127542";
		String dbLogisticsBatchSerialNo = "FI20171228141645127542";
		boolean result = StringUtils.equals(dbLogisticsSerialNo, dbLogisticsBatchSerialNo);
		if (null == dbLogisticsBatchSerialNo || result ) {
			System.out.println("dfg");
		}
	}

	public static String generateSerialNumber() {

		final int Min = 100;
		final int Max = 999;
		Random random = new Random(java.util.UUID.randomUUID().hashCode());
		int number = random.nextInt((Max - Min) + 1) + Min;

		return String.valueOf(number);
	}

	@Test
	public void test23() {
		Integer num = 1;

		method1(num);
		num++;
		method2(num);


	}

	private void method2(int num) {
		System.out.println(num);
	}

	private void method1(int num) {
		num++;
	}
}

package javaDate;

import com.google.common.collect.Lists;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author junmeng.xu
 * @date 2016年2月25日下午5:30:20
 */
public class Main {

	/**
	 * 获取当前时间的下一天
	 * @throws ParseException
	 */
/*	@Test
	public void test244() throws ParseException{
		String date = "2016-03-28";
    	String dateStr = DateUtil.formatDate(date, "yyyy-MM-dd", "yyyy-MM-dd HH:mm:ss");
    	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
    	Date dd = sdf.parse(dateStr);
//    	int month = dd.getMonth();
//    	int aa = month - 1;
//    	dd.setMonth(aa);
    	int hours = dd.getHours();
    	int bb = hours - 24;
    	dd.setHours(bb);
    	String formatDate = DateUtil.formatDate(dd, "yyyy-MM-dd");
		System.out.println(formatDate);
	}*/
	
	/**
	 * 对yyyy-MM-dd时间格式化成Mon Jan 01 00:00:00 CST 2007
	 * @throws Exception
	 */
/*	@Test
	public void test22222() throws Exception{
    	String date = "2007-01-01";
    	Date dd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(DateUtil.formatDate(date, "yyyy-MM-dd", "yyyy-MM-dd HH:mm:ss"));
		System.out.println(dd);
	}*/
	
	/**
	 * 获取两个时间点相差几天
	 * @throws Exception
	 */
	@Test
	public void test2() throws Exception{
		String from = "2008-01-01";
		String to = "2008-03-01";
    	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); 
    	Date fromDate = sdf.parse(from);
    	Date toDate = sdf.parse(to);
    	long diff = toDate.getTime() - fromDate.getTime();
    	long days = diff/(1000*60*60*24);
    	System.out.println(days);
    	
	}
	/**
	 * 获取两个时间点的时间差
	 */
	@Test
	public void testtow(){
		Date t1 = new Date();
		System.out.println(t1);
		Date t2 = new Date();
		System.out.println(t2);
		long diff = t2.getTime() - t1.getTime();
		long minute = diff/(1000*60);
		System.out.println(minute);
	}
	/**
	 * 获取两个时间点的时间差
	 * @throws Exception
	 */
	@Test
	public void testsqldate() throws Exception{
		java.sql.Date dd = new java.sql.Date((new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse("2016-4-11 20:01:47")).getTime());
		java.sql.Date dd2 = new java.sql.Date((new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse("2016-4-11 20:50:47")).getTime());
		long mmmm = (dd2.getTime() - dd.getTime())/(1000*60);
		System.out.println(mmmm);
		
	}
	
	/**
	 * 日期格式的转化
	 * @see 20160929 || 2016-09-29 17:09:28 || 2016-09-29
	 */
	@Test
	public void test1() {
		Date date = new Date();
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String time2 = new SimpleDateFormat("yyyy-MM-dd").format(date);
		String time = format.format(date);
		String join = StringUtils.join(
				StringUtils.split(
						new SimpleDateFormat("yyyy-MM-dd").format(date), "-"),
				null);
		System.out.println(join);
		System.out.println(time);
		System.out.println(time2);
	}

	/**
	 * 日期转换
	 */
//	@Test
//	public void test2222(){
//		String dt = DateUtil.formatDate(new Date(), DateUtil.ISO_DATE_PATTERN);
//		System.out.println(dt);
//	}

	@Test
	public void asd() throws ParseException {
		//欲轉換的日期字串
		String dateString = "2010-03-02";
		//設定日期格式
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		//進行轉換
		Date date = sdf.parse(dateString);
		System.out.println(date);
	}

	@Test
	public void test232sd(){
		ArrayList<Object> objects = Lists.newArrayList();
		objects.add("贷款纠纷");
		objects.add("色粉");
		objects.add("挺好地方");
		String str = "";
		for (Object object : objects) {
			str = str + "," + object;
		}
		String substring = str.substring(0, str.length() - 1);
		System.out.println(substring);

	}

	/**
	 * 获取当前时间的前N分钟的点
	 */
	@Test
	public void test2zxc(){
		int second = -10;
		
		Calendar calendar = GregorianCalendar.getInstance();
		calendar.setTime(new Date());
		calendar.add(Calendar.MINUTE, second);
		System.out.println(calendar.getTime());
	}
	/**
	 * 输入两个时间，得到两个时间间隔中的所有天数
	 * @throws Exception 
	 */
	@Test
	public void testPeriod() throws Exception{
		 Calendar startCalendar = Calendar.getInstance();
	     Calendar endCalendar = Calendar.getInstance();
	     SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
	     startCalendar.setTime(df.parse("2007-01-01"));
	     endCalendar.setTime(df.parse("2016-09-01"));
	     ArrayList<Object> list = Lists.newArrayList();
	     while(true){
	         startCalendar.add(Calendar.DAY_OF_MONTH, 1);
	         if(startCalendar.getTimeInMillis() < endCalendar.getTimeInMillis()){
	        	 // 转数组或是集合，楼主看着写吧
	        	 String format = df.format(startCalendar.getTime());
	        	 list.add(format);
	         }else{
	        	 break;
	         }
	     }
	     for (int i = (list.size() - 1); i >= 0; i--) {
	    	 System.out.println(list.get(i));
	     }
	}

	/**
	 * 根据freq，获取间隔freq的一个日期
	 */
/*	@Test
	public void testFreq(){
		String date = "2016-05-08";
		String freq = "M";
		String from1 = nextFreqDate(date, freq, -1);
		System.out.println(from1);
	}
	public static String nextFreqDate(String date, String freq, int offset) {
		String dt = date;
		if ("Q".equals(freq)) {
			dt = nextMonths(date, 3 * offset);
		} else if ("M".equals(freq)) {
			dt = nextMonths(date, offset);
		} else if ("W".equals(freq)) {
			dt = nextDays(date, 7 * offset);
		}
		return dt;
	}
	public static String nextMonths(String ymd, Integer month) {
		Date dt = null;
		if (month == null) month = 1;
		try {
			dt = DateUtil.parseDate(ymd);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dt);
		calendar.add(Calendar.MONTH, month);
		return DateUtil.formatDate(calendar.getTime());
	}*/

	/**
	 *
	 */
	@Test
	public void testJiaoYiRi(){
		//模拟所有交易日
		List<String> tradeDates = Lists.newArrayList("2016-10-24", "2016-10-25", "2016-10-26", "2016-10-27"
				, "2016-10-28", "2016-10-31", "2016-11-01", "2016-11-02", "2016-11-03", "2016-11-04");
		//倒序排
		List<String> list = Lists.reverse(tradeDates);


	}

	/**
	 * 时间字符串(yyyy-MM-dd)上增加n(默认1)天
	 */
/*	public static String nextDays(String ymd, Integer day) {
		Date dt = null;
		if (day == null) day = 1;
		try {
			dt = DateUtil.parseDate(ymd);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dt);
		calendar.add(Calendar.DAY_OF_MONTH, day);
		return DateUtil.formatDate(calendar.getTime());
	}*/

	@Test
	public void test323234(){
		Date d = new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		String format = sdf.format(d);
		System.out.println(format);
	}

	//时区的问题
	@Test
	public void test23sd(){
		Date d = new Date();

		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd  kk:mm:ss ");

		sdf.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));

		String format = sdf.format(d);

		Date parse = null;
		try {
			parse = sdf.parse(format);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		System.out.println(parse);

	}

	@Test
	public void test2223() throws Exception{
		String str = "2016-09-29 12:09:28";
		String isoDt = TimeUtils.patternChg(str, TimeUtils.ISO_TIMESTAMP, TimeUtils.ISO_DATE);
		System.out.println(isoDt);
		Date dt = TimeUtils.parseDate(str, TimeUtils.ISO_TIMESTAMP, TimeUtils.TIME_ZONE_SHANGHAI);


		String time2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:00", Locale.CHINESE).format(dt);
		Date date = TimeUtils.parseDate(time2, TimeUtils.ISO_TIMESTAMP, TimeUtils.TIME_ZONE_SHANGHAI);
		System.out.println(date);

		System.out.println(time2);


		System.out.println(dt);
	}

	@Test
	public void asdwe(){
		String str = "2016-09-29 17:09:28";
		String[] split = str.split(" ");
		String[] split1 = split[1].split(":");
		String HH = split1[0];
		String mm = split1[1];
		String ss = split1[2];
		System.out.println(HH + " " + mm + " " + ss);
	}

	/**
	 * 加8小时
	 */
	@Test
	public void test22(){
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Calendar ca=Calendar.getInstance();
		ca.setTime(new Date());
		ca.add(Calendar.HOUR, -8);
		Date time = ca.getTime();
		System.out.println(time);


		//String format = sdf.format(ca.getTime());

	}

	@Test
	public void testasdf2() {
		String bizTypes = "1;5;2;6;3;4";
		List<Integer> bizTypeList = stringToIntegerList(bizTypes, ";");

		Integer bizType = 2;
		if (!bizTypeList.contains(bizType)) {
			System.out.println("asdfasdf");
		}

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

}

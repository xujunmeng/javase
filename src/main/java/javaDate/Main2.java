package javaDate;

import org.junit.Test;

import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


/**
 * @author junmeng.xu
 * @date 2016年4月27日下午4:06:33
 */
public class Main2 {


    /**
     * 对 Apr 10, 2016 9:37:47 PM 格式化
     * @throws ParseException
     */
/*    @Test
    public void test() throws ParseException{
    	String pdt = "Apr 10, 2016 9:37:47 PM";
    	String dateStr = DateUtil.formatDate(pdt, "MMM dd',' yyyy hh:mm:ss aaa", "yyyy-MM-dd HH:mm:ss");
    	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
    	Date date = sdf.parse(dateStr);
    	String announceDate = announceDate(date);
    	
    	System.out.println(announceDate);
    	String dateStr2 = DateUtil.formatDate(pdt, "MMM dd',' yyyy hh:mm:ss aaa", "yyyy-MM-dd");
    	System.out.println(dateStr);
    	System.out.println(dateStr2);
    }*/
    /**
     * announce date
     * if date >= 9:30, add 1 day
     */
/*    private static String announceDate(Date dt){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dt);
        if (calendar.get(Calendar.HOUR_OF_DAY) > 9
                || (calendar.get(Calendar.HOUR_OF_DAY) == 9 && calendar.get(Calendar.MINUTE) >= 30)) {
            calendar.add(Calendar.DAY_OF_MONTH, 1);
        }
        return DateUtil.formatDate(calendar.getTime());
    }*/


    /**
     * 获取当前时间点的前一天
     */
/*    @Test
    public void test33(){
    	String nextDays = nextDays("2016-04-11", -1);
    	System.out.println(nextDays);
    }
    //时间字符串(yyyy-MM-dd)上增加n(默认1)天
    public static String nextDays(String ymd, Integer day) {
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

    /**
     * 获取到前30天的时间点
     * @throws Exception
     */
/*    @Test
    public void testbefore30() throws Exception{
    	String date = "2016-04-01";
    	Date parseDate = DateUtil.parseDate(date);
    	Date daysBefore = DateUtil.getDaysBefore(parseDate, -30);
    	String formatDate = DateUtil.formatDate(daysBefore);
    	System.out.println(formatDate);
    }*/

    /**
     * 获取100天后的日期
     */
/*    @Test
    public void testNextDays(){
    	String to = "2016-02-02";
    	String nextDayss = nextDayss(to, 100);
    	System.out.println(nextDayss);
    }*/
    
/*    public static String nextDayss(String ymd, Integer day) {
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


    /**
     * 获取下一年的时间
     */
/*    @Test
    public void testnextYear(){
    	String from = "2015-05-05";
    	String to = "2015-08-05";
    	String nextYearDate = nextYearDate(from);
    	System.out.println(nextYearDate);
    }
    private String nextYearDate(String date){
        try {
            return DateUtil.formatDate(DateUtil.getPreOrNextYears(DateUtil.parseDate(date), 1));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }*/

    /**
     * 比较两个日期
     */
    @Test
    public void test2222() {
        String str1 = "2016-06-06";
        String str2 = "2016-06-06";
        int compareTo = str1.compareTo(str2);
        System.out.println(compareTo);
    }


    @Test
    public void test2112() throws ParseException {

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Calendar calendar = Calendar.getInstance();

        String dateStr = "2019-07-18 10:48:30";

        calendar.setTime(df.parse(dateStr));

        //HOUR_OF_DAY 指示一天中的小时
        calendar.set(Calendar.HOUR_OF_DAY, calendar.get(Calendar.HOUR_OF_DAY) - 1);


        System.out.println("一个小时前的时间：" + calendar.getTime());
        System.out.println("一个小时前的时间：" + df.format(calendar.getTime()));

        System.out.println("当前的时间：" + df.format(new Date()));

    }

    @Test
    public void test2236t() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MINUTE, -5);// 5分钟之前的时间
        Date beforeD = calendar.getTime();
        System.out.println(beforeD);
    }

    @Test
    public void test234d() {
        Format format = new SimpleDateFormat("yyyyMMddHHmmss");
        System.out.println(format.format(new Date()));
    }

    @Test
    public void tes3434() {
        Calendar ca=Calendar.getInstance();
        Calendar ca1=Calendar.getInstance();
        ca.set(2002,1,1);
        ca1.set(2002,1,2);
        long l=(ca1.getTime().getTime()-ca.getTime().getTime());
        System.out.println(l/(3600*1000)); //算出来的是隔多少小时
    }

    @Test
    public void testxdd() {
        long end = 1501151400000L;
        long begin = 1501150478292L;

        long i = (end - begin) / (3600*1000);
        System.out.println(i);

        //(appointmentModel.getExpectedPickupDt().getTime() - new Date().getTime() / (3600*1000)  1501150983014
    }


    @Test
    public void test23234() throws ParseException {
        String dateStr = "2020-06-25 2:00:00";
        String pattern = "yyyy-MM-dd HH:mm:ss";
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
        Date dt = dateFormat.parse(dateStr);

        Date pointDt = getPointDt(dt, 20, 1);
        System.out.println(pointDt);
    }

    /**
     *
     * @param hourOfDay 小时数
     * @param dateAmount 日期往后增加一天.整数往后推,负数往前移动
     * @return
     */
    public static Date getPointDt(Date dt, int hourOfDay, int dateAmount) throws ParseException {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dt);

        calendar.set(
                calendar.get(Calendar.YEAR),
                calendar.get(Calendar.MONTH),
                calendar.get(Calendar.DAY_OF_MONTH),
                hourOfDay, 0, 0);
        calendar.add(Calendar.DATE, dateAmount);
        Date date = calendar.getTime();
        return date;
    }
}

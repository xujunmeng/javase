package javaDate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by junmeng.xu on 2016/11/22.
 */
public class TimeUtils {
    public static final String SIMPLE_DATE		= "yyyyMMdd";
    public static final String SIMPLE_TIMESTAMP	= "yyyyMMddHHmmss";
    public static final String ISO_DATE 	 	= "yyyy-MM-dd";
    public static final String ISO_TIMESTAMP 	= "yyyy-MM-dd HH:mm:ss";
    public static final String MSEL_TIMESTAMP	= "yyyy-MM-dd HH:mm:ss.SSS";

    public static String TIME_ZONE_UTC = "UTC";						// +0时区
    public static String TIME_ZONE_SHANGHAI = "Asia/Shanghai";		// +8时区

    /**
     * String转Date
     *
     * @param strDate
     * @param datePattern
     * @param timeZoneID
     * @return
     * @throws ParseException
     */
    public static Date parseDate(String strDate, String datePattern, String timeZoneID) throws ParseException {
        SimpleDateFormat df = new SimpleDateFormat(datePattern);
        TimeZone tz = TimeZone.getTimeZone(timeZoneID);
        df.setTimeZone(tz);
        return df.parse(strDate);
    }

    /**
     * Date转String
     *
     * @param date
     * @param datePattern
     * @param timeZoneID
     * @return
     */
    public static String formatDate(Date date, String datePattern, String timeZoneID) {
        SimpleDateFormat df = new SimpleDateFormat(datePattern);
        TimeZone tz = TimeZone.getTimeZone(timeZoneID);
        df.setTimeZone(tz);
        return df.format(date);
    }

    /**
     * 转换日期格式
     *
     * @param strDate		日期，如：2015-01-01
     * @param fromPattern	如：yyyy-MM-dd
     * @param toPattern		如：yyyyMMdd
     * @return				20150101
     * @throws ParseException
     */
    public static String patternChg(String strDate, String fromPattern, String toPattern) throws ParseException {
        return formatDate(parseDate(strDate, fromPattern, TIME_ZONE_SHANGHAI), toPattern, TIME_ZONE_SHANGHAI);
    }
}

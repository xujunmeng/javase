package Main函数执行时传入参数;

import javaDate.TimeUtils;

import java.text.ParseException;
import java.util.Date;

/**
 * Created by junmeng.xu on 2016/12/1.
 */
public class Main {

    public static void main(String[] args) throws ParseException {

        if (args.length >= 5){
            //D:\hq_all.log.2016-11-17
            String fileName = args[0];
            //参数2：开始时间
            String beginDate = args[1] + " " + args[2];
            //参数3：结束时间
            String endDate = args[3] + " " + args[4];

            System.out.println("fileName : " + fileName);

            System.out.println("beginDate : " + beginDate);

            System.out.println("endDate : " + endDate);

            String strDate = "2016-12-01 09:35:32";

            Date begin = TimeUtils.parseDate(beginDate, TimeUtils.ISO_TIMESTAMP, TimeUtils.TIME_ZONE_SHANGHAI);

            Date end = TimeUtils.parseDate(endDate, TimeUtils.ISO_TIMESTAMP, TimeUtils.TIME_ZONE_SHANGHAI);

            Date str = TimeUtils.parseDate(strDate, TimeUtils.ISO_TIMESTAMP, TimeUtils.TIME_ZONE_SHANGHAI);

            if((str.getTime() >= begin.getTime()) && (str.getTime() <= end.getTime())){
                System.out.println("后面两个值 ： " + endDate + " >= " + strDate + " >= " + beginDate);
            }


        }


    }

}

package 流水号;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.*;

/**
 * Created by james on 2017/6/8.
 */
public class SerialNumber {

    private static final int MAX_VALUE=9999;
    private static final String FORMAT = "yyyyMMdd";
    private static final Format DF = new SimpleDateFormat(FORMAT);
    private static final byte[] lock = new byte[0];
    private String prefix = null;
    private Date date = null;
    private int number=1;
    private static Map<String, SerialNumber> map = new HashMap<>();

    private SerialNumber(String prefix,Date date){
        this.prefix = prefix;
        this.date = date;
    }

    public static SerialNumber newInstance(String prefix){
        Date date = new Date();
        return newInstance(prefix,date);
    }

    public static SerialNumber newInstance(String prefix,Date date){
        SerialNumber o = null;
        synchronized (lock) {
            String key = getKey(prefix, date);
            if(map.containsKey(key)){
                o = map.get(key);
                int number = o.getNumber();
                if(number<MAX_VALUE){
                    o.setNumber(number+1);
                }else {
                    o.setNumber(1);
                }

            } else {
                o = new SerialNumber(prefix,date);
                map.put(key, o);
            }
        }
        return o;
    }



    private static String getKey(String prefix,Date date){
        return prefix+format(date);
    }

    private static String format(Date date){
        return DF.format(date);
    }

    public String toString(){
        return  prefix+ format(date) + String.format("%04d", number);
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }



    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService pool = Executors.newFixedThreadPool(6);
        pool.submit(new TestThread());
        pool.submit(new TestThread());
        pool.submit(new TestThread());
        pool.shutdown();



    }

}
class TestThread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(SerialNumber.newInstance("YC").toString());
        }
    }
}
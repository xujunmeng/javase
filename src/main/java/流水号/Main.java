package 流水号;

import org.junit.Test;

import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * Created by james on 2017/6/26.
 */
public class Main {

    public static String generateQuotationReturnSerialNo() {
        final int Min = 1000;
        final int Max = 9999;
        Random random = new Random(java.util.UUID.randomUUID().hashCode());
        int number = random.nextInt((Max - Min) + 1) + Min;

        String date = new SimpleDateFormat("yyyyMMdd").format(new Date());

        return MessageFormat.format("YC{0}{1}", date, String.valueOf(number));
    }

    @Test
    public void test() {
        String s = generateQuotationReturnSerialNo();
        System.out.println(s);
    }

}

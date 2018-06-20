package 利用位操作来进行状态操作;

import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.MessageFormat;

/**
 * Created by james on 2017/8/22.
 */
public class Main {

    public static void main(String[] args) throws UnsupportedEncodingException {



        //System.out.println((0x01 | 0x11 & 0x11) == 0x11);

        //System.out.println((0x01 | 0x11 & 0x11) == 0x11);


        //第一个值：  第二个值：枚举    第三个值：
        int result = 4 | 16 | 32;
        System.out.println("result : " + result);
        System.out.println((32 | result) == result);
        System.out.println((16 | result) == result);
        System.out.println((4 | result) == result);
        System.out.println((2 | result) == result);


        //生成的值可以代表多个状态


        //System.out.println(16 | 0);


    }

    @Test
    public void test() {
        int result = 4;
        System.out.println((4 | result) == result);
    }

    @Test
    public void test2() {
        int result = 4 | 32;
        System.out.println("result : " + result);
        int returnReasonType = 36;
        System.out.println((returnReasonType | 4) == returnReasonType);
        System.out.println((returnReasonType | 32) == returnReasonType);
    }

    @Test
    public void test3() {
        int result = 4 | 0;
        System.out.println("result : " + result);
        int result2 = 32 | result;
        System.out.println("result2 : " + result2);
    }

    @Test
    public void test4() {
        System.out.println((0 | 4) == 0);
    }

    @Test
    public void testss() {
        Integer returnReasonType = 32;
        System.out.println(((returnReasonType | returnReasonType) != 4) && ((returnReasonType | 32) != returnReasonType));
    }

    @Test
    public void etstss() {
        int result = 2014 | 2022 | 2072 | 2453 | 3212 | 4;
        System.out.println((result | 32) == result);
    }

    @Test
    public void testsdf() {
        int result = 1 | 2 | 4 | 8;
        System.out.println(result);
        System.out.println((result | 1) == result);
        System.out.println((result | 2) == result);
    }

    //该种情况用数据库表示会更好
    @Test
    public void swear() {
        int mysqlValue = 0 | 1 | 2 | 4 | 8;
        System.out.println(mysqlValue);

        System.out.println(1 & mysqlValue);
        System.out.println(2 & mysqlValue);
        System.out.println(4 & mysqlValue);
        System.out.println(16 & mysqlValue);

        int temp = mysqlValue & 2;
        System.out.println(temp == 2);

        int result2 = 1 | 4 | 8;
        System.out.println(result2);

        int result3 = 2 ^ mysqlValue;
        System.out.println(result3);



    }

    @Test
    public void asfds() {
        int y = 0;
        int a = 1;
        int b = 2;
        int c = 4;
        int d = 8;
        int result_1 = a ^ b;
        int result_2 = a | b;
        int result_3 = y ^ b;
        System.out.println(result_1);
        System.out.println((result_1 & a) == a);
        System.out.println((result_1 | a) == result_1);
        System.out.println(result_3);

    }

    @Test
    public void tes23() {
        int i  = 16 | 8;
        System.out.println(i);
    }


}

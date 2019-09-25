package 利用位操作来进行状态操作;

import InheritedGenericClass.泛型方法.类中的泛型方法.Person;
import com.google.common.collect.Lists;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.stream.Collectors;

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
        System.out.println((result | 8) == result);
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

    @Test
    public void test23424() {
        int a = 0;
        int b = 1;
        int c = 2;
        int d = 4;
        int e = 8;
        System.out.println(a | b);
        System.out.println(b | c | c);
        System.out.println(b | c | d);
    }

    @Test
    public void set232() {
        int result_1 = 5;

        int param = 8;

        System.out.println((result_1 & param) == param);
        System.out.println((result_1 | param) == result_1);
    }

    @Test
    public void wserse() {
        Integer flags = 2;
        flags = flags | 4;
        System.out.println(flags);

        System.out.println((flags | 4) == flags);

    }

    @Test
    public void wserse2() {
        Integer flags = 0|4;
        System.out.println(flags);

        System.out.println((flags | 0) == flags);

    }

    @Test
    public void w3sDF() {
        Integer flags = 2|4|8;
        System.out.println(flags);
        System.out.println((flags | 16) == flags);
    }

    @Test
    public void test435() {
        List<Person> list = Lists.newArrayList();
//        Person person = new Person();
//        person.setAge(null);
//        person.setName(null);
        list.stream().filter(a -> a.getAge() == 1).collect(Collectors.toList());
    }

    @Test
    public void asdfasdf() {
        Integer flags = 0;
        if ((flags.intValue() | 0) == flags.intValue()) {
            System.out.println("456tdrtfg");
        }
        if ((flags.intValue() | 16) == flags.intValue()) {
            System.out.println("asdf");
        }
    }

    @Test
    public void wsersdF() {
        for (int i = 0; i < 1000; i++) {
            int a = (int)(Math.random()*(9999-1000+1))+1000;
            System.out.println(a);
        }
    }

    @Test
    public void tesdst() {
        int aa = 36;
        if (aa != 0 && ((aa | 8) == aa || (aa | 32) == aa)) {
            System.out.println("sadfsdf");
        } else{
            System.out.println("3423223");
        }
    }

}

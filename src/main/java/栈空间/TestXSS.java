package 栈空间;

/**
 * @author james
 * @date 2019/10/8
 */
public class TestXSS {

    private static long count = 0;

    public static void main(String[] args) {
        method(1);
    }

    public static void method(long a) {
        System.out.println(count++);
        method(a);
    }

}

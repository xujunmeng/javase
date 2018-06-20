package javaStr;

/**
 * Created by james on 2018/5/17.
 */
public class Main {


    public static void main(String[] args) {

        String c = "3";

        String a = "1";
        String b = "2";

        String.valueOf("223");

        AAA aaa = new AAA();
        aaa.setA("xxx");

        System.out.println(a);
        compareMethod(a, b);
        System.out.println(a);

        System.out.println(aaa);
        compareMethodAAA(aaa);
        System.out.println(aaa);

    }

    private static void compareMethod(String a, String b) {
        boolean aaaaa = a == b;
        boolean bbbbb = a.equals(b);
        System.out.println(aaaaa);
        a = "3";
        System.out.println(a);
        b = "4";
        System.out.println(b);
    }

    private static void compareMethodAAA(AAA aaa) {
        aaa = new AAA("yyy");
        System.out.println(aaa);
    }

}
class  AAA {
    private String a;

    public AAA() {
    }

    public AAA(String a) {
        this.a = a;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "AAA{" +
                "a='" + a + '\'' +
                '}';
    }
}
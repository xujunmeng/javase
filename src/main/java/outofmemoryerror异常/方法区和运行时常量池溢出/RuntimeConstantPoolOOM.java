package outofmemoryerror异常.方法区和运行时常量池溢出;

/**
 * @author james
 * @date 2019/10/9
 */
public class RuntimeConstantPoolOOM {

    public static void main(String[] args) {

        String str1 = new StringBuilder("计算机").append("软件").toString();
        System.out.println(str1.intern() == str1);

        String str2 = new StringBuilder("ja").append("va").toString();
        String intern2 = str2.intern();
        System.out.println(str2);
        System.out.println(intern2);
        System.out.println(intern2 == str2);

        String str3 = new String("asdf");
        System.out.println(str3.intern() == str3);

    }

}

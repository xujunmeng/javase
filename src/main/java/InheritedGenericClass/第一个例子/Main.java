package InheritedGenericClass.第一个例子;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * ArrayList可以存放任意类型，例子中添加了一个String类型，添加了一个Integer类型，
 * 再使用时都以String的方式使用，因此程序崩溃了。
 * 为了解决类似这样的问题（在编译阶段就可以解决），泛型应运而生。
 *
 * 我们将第一行声明初始化list的代码更改一下，编译器会在编译阶段就能够帮我们发现类似这样的问题。
 *
 *
 *
 * @author james
 * @date 2018/8/28
 */
public class Main {

    @Test
    public void test() {
        List arrayList = new ArrayList<>();
        arrayList.add("aaa");
        arrayList.add(199);

        for (int i = 0; i < arrayList.size(); i++) {
            String item = (String) arrayList.get(i);
            System.out.println(item);
        }
    }

    @Test
    public void test2() {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("aaa");
//        arrayList.add(199);

        for (int i = 0; i < arrayList.size(); i++) {
            String item = (String) arrayList.get(i);
            System.out.println(item);
        }
    }

    /**
     * 泛型只在编译阶段有效。
     *
     * 通过上面的例子可以证明，在编译之后程序会采取去泛型化的措施。
     * 也就是说Java中的泛型，只在编译阶段有效。
     * 在编译过程中，正确检验泛型结果后，会将泛型的相关信息擦出，
     * 并且在对象进入和离开方法的边界处添加类型检查和类型转换的方法。
     * 也就是说，泛型信息不会进入到运行时阶段。
     *
     * 泛型类型在逻辑上看以看成是多个不同的类型，实际上都是相同的基本类型
     *
     */
    @Test
    public void test3() {
        List<String> stringArrayList = new ArrayList<>();
        List<Integer> integerArrayList = new ArrayList<>();

        Class classStringArrayList = stringArrayList.getClass();
        Class classIntegerArrayList = integerArrayList.getClass();

        if(classStringArrayList.equals(classIntegerArrayList)){
            System.out.println("泛型测试,类型相同");
        }
    }

}

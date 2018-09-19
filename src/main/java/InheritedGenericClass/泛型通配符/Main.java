package InheritedGenericClass.泛型通配符;

import InheritedGenericClass.泛型类.Generic;
import org.junit.Test;

/**
 *
 * 我们知道Integer是Number的一个子类，
 * 同时在特性章节中我们也验证过Generic<Ingeter>与Generic<Number>实际上是相同的一种基本类型。
 * 那么问题来了，在使用Generic<Number>作为形参的方法中，能否使用Generic<Ingeter>的实例传入呢？
 * 在逻辑上类似于Generic<Number>和Generic<Ingeter>是否可以看成具有父子关系的泛型类型呢？
 *
 * 为了弄清楚这个问题，我们使用Generic<T>这个泛型类继续看下面的例子：
 *
 * 通过提示信息我们可以看到Generic<Integer>不能被看作为`Generic<Number>的子类。
 * 由此可以看出:同一种泛型可以对应多个版本（因为参数类型是不确定的），不同版本的泛型类实例是不兼容的。
 *
 * 回到上面的例子，如何解决上面的问题？
 * 总不能为了定义一个新的方法来处理Generic<Integer>类型的类，这显然与java中的多态理念相违背。
 * 因此我们需要一个在逻辑上可以表示同时是Generic<Integer>和Generic<Number>父类的引用类型。
 * 由此类型通配符应运而生。
 *
 *
 * @author james
 * @date 2018/8/28
 */
public class Main {

    @Test
    public void test() {
        Generic<Integer> gInteger = new Generic<>(123);
        Generic<Number> gNumber = new Generic<>(456);

        showKeyValue(gNumber);

        // showKeyValue这个方法编译器会为我们报错：Generic<java.lang.Integer>
        // cannot be applied to Generic<java.lang.Number>
        // showKeyValue(gInteger);

    }


    /**
     * 类型通配符一般是使用？代替具体的类型实参，注意了，此处’？’是类型实参，而不是类型形参 。
     * 重要说三遍！此处’？’是类型实参，而不是类型形参 ！ 此处’？’是类型实参，而不是类型形参 ！
     * 再直白点的意思就是，此处的？和Number、String、Integer一样都是一种实际的类型，
     * 可以把？看成所有类型的父类。是一种真实的类型。
     *
     * 可以解决当具体类型不确定的时候，这个通配符就是 ?  ；当操作类型时，不需要使用类型的具体功能时，
     * 只使用Object类中的功能。那么可以用 ? 通配符来表未知类型。
     */
    @Test
    public void test2() {
        Generic<Integer> gInteger = new Generic<>(123);
        Generic<Number> gNumber = new Generic<>(456);

        showKeyValue1(gNumber);
        showKeyValue1(gInteger);
    }


    public void showKeyValue(Generic<Number> obj) {
        System.out.println("泛型测试, key value is " + obj.getKey());
    }

    public void showKeyValue1(Generic<?> obj) {
        System.out.println("泛型测试, key value is " + obj.getKey());
    }

}

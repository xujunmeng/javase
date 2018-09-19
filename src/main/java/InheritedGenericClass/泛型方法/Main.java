package InheritedGenericClass.泛型方法;

import org.junit.Test;

/**
 * 在java中,泛型类的定义非常简单，但是泛型方法就比较复杂了。
 *
 * 尤其是我们见到的大多数泛型类中的成员方法也都使用了泛型，
 * 有的甚至泛型类中也包含着泛型方法，这样在初学者中非常容易将泛型方法理解错了。
 *
 * 泛型类，是在实例化类的时候指明泛型的具体类型；泛型方法，是在调用方法的时候指明泛型的具体类型 。
 *
 *
 * @author james
 * @date 2018/8/28
 */
public class Main {

    /**
     * 泛型方法的基本介绍
     * @param tClass 传入的泛型实参
     * @return T 返回值为T类型
     * 说明：
     *     1）public 与 返回值中间<T>非常重要，可以理解为声明此方法为泛型方法。
     *     2）只有声明了<T>的方法才是泛型方法，泛型类中的使用了泛型的成员方法并不是泛型方法。
     *     3）<T>表明该方法将使用泛型类型T，此时才可以在方法中使用泛型类型T。
     *     4）与泛型类的定义一样，此处T可以随便写为任意标识，常见的如T、E、K、V等形式的参数常用于表示泛型。
     */
    public <T> T genericMethod(Class<T> tClass)throws InstantiationException , IllegalAccessException{

        T instance = tClass.newInstance();

        return instance;
    }

    public void demoMethod() {
        System.out.println("sadf");
    }

    @Test
    public void test() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Object o = genericMethod(Class.forName("InheritedGenericClass.泛型方法.Main"));
        System.out.println(o);
    }

}

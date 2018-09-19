package InheritedGenericClass.泛型类;

import org.junit.Test;

/**
 * @author james
 * @date 2018/8/28
 */
public class Main {

    /**
     * 泛型类型用于类的定义中，被称为泛型类。
     * 通过泛型可以完成对一组类的操作对外开放相同的接口。最典型的就是各种容器类，如：List、Set、Map。
     */
    @Test
    public void test() {
        //泛型的类型参数只能是类类型（包括自定义类），不能是简单类型
        //传入的实参类型需与泛型的类型参数类型相同，即为Integer.
        Generic<Integer> genericInteger = new Generic<>(123456);

        //传入的实参类型需与泛型的类型参数类型相同，即为String.
        Generic<String> genericString = new Generic<>("key_vlaue");
        System.out.println(("泛型测试,key is " + genericInteger.getKey()));
        System.out.println(("泛型测试,key is " + genericString.getKey()));
    }

    /**
     * 定义的泛型类，就一定要传入泛型类型实参么？
     * 并不是这样，在使用泛型的时候如果传入泛型实参，
     * 则会根据传入的泛型实参做相应的限制，此时泛型才会起到本应起到的限制作用。
     * 如果不传入泛型类型实参的话，在泛型类中使用泛型的方法或成员变量定义的类型可以为任何的类型。
     */
    @Test
    public void test2() {
        Generic generic = new Generic("111111");
        Generic generic1 = new Generic(4444);
        Generic generic2 = new Generic(55.55);
        Generic generic3 = new Generic(false);

        System.out.println(("泛型测试,key is " + generic.getKey()));
        System.out.println(("泛型测试,key is " + generic1.getKey()));
        System.out.println(("泛型测试,key is " + generic2.getKey()));
        System.out.println(("泛型测试,key is " + generic3.getKey()));
    }

    /**
     * 泛型的类型参数只能是类类型，不能是简单类型。
     不能对确切的泛型类型使用instanceof操作。如下面的操作是非法的，编译时会出错。

     if(ex_num instanceof Generic<Number>){
     }
     */


}

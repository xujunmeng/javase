package InheritedGenericClass.泛型方法.类中的泛型方法;

/**
 * @author james
 * @date 2018/8/28
 */
public class GenerateTest<T> {

    public void show_1(T t) {
        System.out.println(t.toString());
    }

    //在泛型类中声明了一个泛型方法，使用泛型E，这种泛型E可以为任意类型。可以类型与T相同，也可以不同。
    //由于泛型方法在声明的时候会声明泛型<E>，因此即使在泛型类中并未声明泛型，编译器也能够正确识别泛型方法中识别的泛型。
    public <E> void show_3(E e) {
        System.out.println(e.toString());
    }

    //在泛型类中声明了一个泛型方法，使用泛型T，注意这个T是一种全新的类型，可以与泛型类中声明的T不是同一种类型。
    public <T> void show_2(T t) {
        System.out.println(t.toString());
    }

}

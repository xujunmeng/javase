package InheritedGenericClass.泛型接口;

/**
 *
 * 泛型接口与泛型类的定义及使用基本相同。泛型接口常被用在各种类的生产器中
 *
 * Created by james on 2018/8/28.
 */
public interface Generator<T> {

    boolean set();

    T next();

}

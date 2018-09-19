package InheritedGenericClass.泛型类;

/**
 *
 * 此处T可以随便写为任意标识，常见的如T、E、K、V等形式的参数常用于表示泛型
 * 在实例化泛型类时，必须指定T的具体类型
 *
 * @author james
 * @date 2018/8/28
 */
public class Generic<T> {

    //key 这个成员变量的类型为T，T 的类型由外部指定
    private T key;

    //泛型构造方法形参key的类型也为T，T的类型由外部指定
    public Generic(T key) {
        this.key = key;
    }

    //泛型方法getKey的返回值类型为T，T的类型由外部指定
    public T getKey() {
        return key;
    }


}

package InheritedGenericClass.泛型上下边界;

import InheritedGenericClass.泛型类.Generic;
import org.junit.Test;

/**
 *
 * 在使用泛型的时候，我们还可以为传入的泛型类型实参进行上下边界的限制，
 * 如：类型实参只准传入某种类型的父类或某种类型的子类。
 *
 * 为泛型添加上边界，即传入的类型实参必须是指定类型的子类型
 *
 *
 *
 *
 * 如果我们把泛型类的定义也改一下:
 *
 *  public class Generic<T extends Number>{
 *  private T key;
 *
 *  public Generic(T key) {
 *  this.key = key;
 *  }
 *
 *  public T getKey(){
 *  return key;
 *  }
 *  }
 *  //这一行代码也会报错，因为String不是Number的子类
 *  Generic<String> generic1 = new Generic<String>("11111");
 *
 * @author james
 * @date 2018/8/28
 */
public class Main {

    @Test
    public void test() {
        Generic<String> generic1 = new Generic<>("11111");
        Generic<Integer> generic2 = new Generic<>(2222);
        Generic<Float> generic3 = new Generic<>(2.4f);
        Generic<Double> generic4 = new Generic<>(2.56);

        //这一行代码编译器会提示错误，因为String类型并不是Number类型的子类
        //showKeyValue1(generic1);

        showKeyValue1(generic2);
        showKeyValue1(generic3);
        showKeyValue1(generic4);
    }

    public void showKeyValue1(Generic<? extends Number> obj){
        System.out.println(("泛型测试,key value is " + obj.getKey()));
    }

}

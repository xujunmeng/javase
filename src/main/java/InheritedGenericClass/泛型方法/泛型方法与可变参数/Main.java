package InheritedGenericClass.泛型方法.泛型方法与可变参数;

import org.junit.Test;

/**
 * @author james
 * @date 2018/8/28
 */
public class Main {

    @Test
    public void test() {
        printMsg("111",222,"aaaa","2323.4",55.55);
    }

    public <T> void printMsg( T... args){
        for(T t : args){
            System.out.println(("泛型测试,t is " + t));
        }
    }

}

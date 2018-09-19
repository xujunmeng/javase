package InheritedGenericClass.泛型接口;

import org.junit.Test;

/**
 * @author james
 * @date 2018/8/28
 */
public class Main {

    @Test
    public void test() {
        FruitGenerator<String> fruitGenerator = new FruitGenerator();
        String next = fruitGenerator.next();
        System.out.println(next);
    }

    @Test
    public void test2() {
        FruitGenerator2 fruitGenerator2 = new FruitGenerator2();
        String next = fruitGenerator2.next();
        System.out.println(next);
    }

}

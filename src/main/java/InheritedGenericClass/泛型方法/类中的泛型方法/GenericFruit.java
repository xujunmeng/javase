package InheritedGenericClass.泛型方法.类中的泛型方法;

/**
 *
 * 当然这并不是泛型方法的全部，泛型方法可以出现杂任何地方和任何场景中使用。
 * 但是有一种情况是非常特殊的，当泛型方法出现在泛型类中时，我们再通过一个例子看一下
 *
 * @author james
 * @date 2018/8/28
 */
public class GenericFruit {

    public static void main(String[] args) {
        Apple apple = new Apple();
        Person person = new Person();

        GenerateTest<Fruit> generateTest = new GenerateTest<>();
        //apple是Fruit的子类，所以这里可以
        generateTest.show_1(apple);
        //编译器会报错，因为泛型类型实参指定的是Fruit，而传入的实参类是Person
        //generateTest.show_1(person);

        //使用这两个方法都可以成功
        generateTest.show_2(apple);
        generateTest.show_2(person);

        //使用这两个方法也都可以成功
        generateTest.show_3(apple);
        generateTest.show_3(person);
    }

}

package InheritedGenericClass.泛型方法.类中的泛型方法;

/**
 * @author james
 * @date 2018/8/28
 */
public class Person {

    private Integer age;
    private String name;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person";
    }

}

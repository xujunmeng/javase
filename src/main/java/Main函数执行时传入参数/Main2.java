package Main函数执行时传入参数;

/**
 * Created by james on 2017/8/2.
 */
public class Main2 {

    public static void main(String[] args) {
        UserTest u1 = new UserTest();
        u1.setAge(2);
        u1.setName("name1");
        test222(u1);

    }

    public static void test222(UserTest user) {
        user = new UserTest("name2", 3);
        System.out.println(user);
    }

}

class UserTest {

    private String name;
    private Integer age;

    public UserTest() {
    }

    public UserTest(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserTest userTest = (UserTest) o;

        if (name != null ? !name.equals(userTest.name) : userTest.name != null) return false;
        return age != null ? age.equals(userTest.age) : userTest.age == null;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (age != null ? age.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "UserTest{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
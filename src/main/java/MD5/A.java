package MD5;

/**
 * Created by james on 2017/12/11.
 */
public class A {

    public static void main(String[] args) {

        A a = new A(){
          private Integer age;

            public Integer getAge() {
                return age;
            }

            public void setAge(Integer age) {
                this.age = age;
            }

            @Override
            public String toString() {
                return "$classname{" +
                        "age=" + age +
                        '}';
            }
        };
        System.out.println(a.getClass());
    }

}

package clone使用;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author james
 * @date 2018/7/19
 */
public class TestObject {

    public static void main(String[] args) throws CloneNotSupportedException {
        Student s = new Student(1, "小时");
        System.out.println(s.clone().getClass());
        System.out.println(s.clone().equals(s));

    }

    @Test
    public void test2() {
        List<Integer> list = Lists.newArrayList(23,34,2);
        List<Integer> collect = list.stream().filter(a -> a.intValue() != 2).collect(Collectors.toList());
        System.out.println(collect);

    }

}

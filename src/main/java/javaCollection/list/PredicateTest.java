package javaCollection.list;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.List;
import java.util.function.Predicate;

/**
 * @author james
 * @date 2018/8/31
 */
public class PredicateTest {

    @Test
    public void test() {
        List<String> list = Lists.newArrayList();
        list.add("asdf");
        list.add("cxvg");
        list.add("2w3d");
        list.add("dcxvc");
        list.add("sd2d");
        boolean b = list.removeIf(ele -> ele.length() > 4);
        System.out.println(b);
        System.out.println(list);
    }

    @Test
    public void test2() {
        List<String> list = Lists.newArrayList();
        list.add("asdf");
        list.add("sdsd");
        list.add("xcvs");
        list.add("sd2e");
        int i = calAll(list, ele -> ((String) ele).contains("2"));
        System.out.println(i);
    }

    /**
     * 统计符合条件的个数
     * @param list
     * @param predicate
     * @return
     */
    public static <T> int calAll(List<T> list, Predicate predicate) {
        int total = 0;
        for (T t : list) {
            //使用predicate的test()方法判断对该对象是否满足Predicate指定的条件
            if (predicate.test(t)) {
                total++;
            }
        }
        return total;
    }

}

package 垃圾收集器;

import com.google.common.collect.Lists;

import java.util.List;

/**
 *
 * -XX:MaxPermSize=10m
 -XX:PermSize=10m
 -Xms100m
 -Xmx100m
 -XX:-UseGCOverheadLimit
 *
 * @author james
 * @date 2020/7/28
 */
public class StringOomMock {

    public static void main(String[] args) {
        List<String> list = Lists.newArrayList();

        for (int i = 0; ; i++) {
            System.out.println(i);
            list.add(String.valueOf("String" + i++).intern());
        }
    }

}

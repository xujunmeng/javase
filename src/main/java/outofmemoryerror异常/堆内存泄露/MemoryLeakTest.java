package outofmemoryerror异常.堆内存泄露;

import java.util.Vector;

/**
 * -Xms200m
 * -Xmx200m
 * -XX:+HeapDumpOnOutOfMemoryError
 * -XX:HeapDumpPath=D:/dump/java_heapdump_MemoryLeakTest1.hprof
 * @author james
 * @date 2019/10/9
 */
public class MemoryLeakTest {

    public static void main(String[] args) {
        Vector v = new Vector(1000000000);
        for (int i = 0; i < v.size(); i++) {
            Object o = new Object();
            v.add(o);
            o = null;
        }

    }

}

package outofmemoryerror异常.堆内存溢出;

import java.util.ArrayList;
import java.util.List;

/**
 * -Xms20m
 * -Xmx20m
 * -XX:+HeapDumpOnOutOfMemoryError
 * -XX:HeapDumpPath=D:/dump/java_heapdump.hprof
 * @author james
 * @date 2019/10/9
 */
public class HeapOOM {

    static class OOMObject {
    }

    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<>();
        while (true) {
            list.add(new OOMObject());
        }
    }

}

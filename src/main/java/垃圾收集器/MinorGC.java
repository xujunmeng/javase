package 垃圾收集器;

/**
 * VM 参数:
 * -verbose:gc
 * -Xms20M
 * -Xmx20M
 * -Mmn10M
 * -XX:PrintGCDetails
 * -XX:SurvivorRatio=8
 * @author james
 * @date 2019/10/11
 */
public class MinorGC {

    private static final int _1MB = 1024 * 1024;

    public static void testAllocation() {
        byte[] allocation1, allocation2, allocation3, allocation4;
        allocation1 = new byte[2 * _1MB];
        allocation2 = new byte[2 * _1MB];
        allocation3 = new byte[2 * _1MB];
        allocation4 = new byte[4 * _1MB];  //出现一次Mionr GC
    }

    public static void main(String[] args) {
        testAllocation();
    }


}

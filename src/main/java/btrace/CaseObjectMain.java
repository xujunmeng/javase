package btrace;

import java.util.Random;

/**
 * BTrace是基于动态字节码修改技术(Hotswap)来实现运行时java程序的跟踪和替换
 * @author james
 * @date 2020/4/7
 */
public class CaseObjectMain {

    public static void main(String[] args) throws InterruptedException {
        Random random = new Random();
        CaseObject object = new CaseObject();
        while (true) {
            boolean result = object.execute(random.nextInt(1000));
            Thread.sleep(1000);
        }
    }

}

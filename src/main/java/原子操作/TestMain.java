package 原子操作;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author james
 * @date 2020/6/29
 */
public class TestMain {

    static AtomicInteger ai = new AtomicInteger(1);

    public static void main(String[] args) {
        System.out.println(ai.getAndIncrement());
        System.out.println(ai.get());
    }

}

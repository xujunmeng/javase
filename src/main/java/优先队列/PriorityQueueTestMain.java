package 优先队列;

import org.junit.Test;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Random;

/**
 * @author james
 * @date 2020/9/2
 */
public class PriorityQueueTestMain {

    @Test
    public void test() {
        PriorityQueue<Student> queue = new PriorityQueue<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getGrade() - o2.getGrade();
            }
        });

        for (int i = 0; i < 10; i++) {
            queue.add(new Student("s", (new Random().nextInt(100))));
        }

        while (!queue.isEmpty()) {
            System.out.println(queue.poll().toString());
        }
    }

}

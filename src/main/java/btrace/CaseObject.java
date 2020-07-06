package btrace;

/**
 * @author james
 * @date 2020/4/7
 */
public class CaseObject {

    private static int sleepTotalTime = 0;

    public boolean execute(int sleepTime) throws InterruptedException {
        System.out.println("sleep : " + sleepTime);
        sleepTotalTime += sleepTime;
        Thread.sleep(sleepTime);
        if (sleepTime % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

}

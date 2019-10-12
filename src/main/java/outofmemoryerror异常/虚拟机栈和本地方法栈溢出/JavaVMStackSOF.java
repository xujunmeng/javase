package outofmemoryerror异常.虚拟机栈和本地方法栈溢出;

/**
 * @author james
 * @date 2019/10/9
 */
public class JavaVMStackSOF {

    private int stackLength = 1;

    public void stackLack() {
        stackLength++;
        stackLack();
    }

    public static void main(String[] args) {
        JavaVMStackSOF javaVMStackSOF = new JavaVMStackSOF();
        try {
            javaVMStackSOF.stackLack();
        } catch (Throwable e) {
            System.out.println("stack length : " + javaVMStackSOF.stackLength);
            throw e;
        }
    }

}

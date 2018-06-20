package javaStr.boolean值比较;

import org.junit.Test;

/**
 * Created by james on 2018/5/30.
 */
public class Main {

    public static void main(String[] args) {

        Boolean a = false;
        if (Boolean.TRUE.equals(a)) {
            System.out.println("asd");
        }

    }

    @Test
    public void tessad() {

        String str = "三星 Galaxy S4";
        if (str.indexOf("其它") != -1 || str.indexOf("其他") != -1) {
            System.out.println("asdfasdf");
        }

    }

}

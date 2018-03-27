package pair;

import javafx.util.Pair;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by james on 2018/3/27.
 */
public class Main {

    @Test
    public void test2() {
        try {
            Pair<Object, Object> v = Pair.class.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }



}

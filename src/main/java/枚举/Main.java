package 枚举;

import org.junit.Test;

/**
 * Created by junmeng.xu on 2016/11/2.
 */
public class Main {

    @Test
    public void test1(){
        QuantType result = QuantType.find("sdf");
        System.out.println(result);
    }

}

enum QuantType{

    Single("single"),
    Parent("parent"),
    Combination("combination");

    private String v;

    QuantType(String v) {
        this.v = v;
    }

    public String getV(){
        return this.v;
    }

    public static QuantType find(String v){
        QuantType[] values = QuantType.values();
        for (QuantType t : values){
            if(t.getV().equals(v)){
                return t;
            }
        }
        return null;
    }
}

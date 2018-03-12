package 枚举.第二个例子;

/**
 * Created by junmeng.xu on 2016/12/8.
 */
public class Main {



}

enum Temp{
    upTwoLevel("-2.0", "2级上游"),
    upOneLevel("-1.0", "1级上游"),
    downOneLevel("1.0", "1级下游"),
    downTwoLevel("2.0", "2级下游");

    private String key;
    private String value;

    Temp(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }



}
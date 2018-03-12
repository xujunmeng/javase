package fastjson的使用;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

/**
 * Created by james on 2017/6/15.
 */
public class FastJsonTest {
    /**
     * 反序列化为json对象
     */
    public static void parseJsonObject()
    {
        String text = "{\"isNeedCheck\": false}";
        JSONObject json = JSON.parseObject(text);
        Boolean isNeedCheck = (Boolean)json.get("isNeedCheck");
        System.out.println(isNeedCheck);
    }

    public static void main(String[] args) {
        parseJsonObject();
    }

}

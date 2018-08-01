package fastjson的使用;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

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

    @Test
    public void test2() {
        String str = "{\"code\":200,\"data\":[{\"_id\":{\"counter\":7712888,\"date\":\"2018-07-29 13:33:35\",\"machineIdentifier\":6838857,\"processIdentifier\":17,\"time\":1532842415000,\"timeSecond\":1532842415,\"timestamp\":1532842415},\"logId\":58531,\"module\":\"quotation\",\"function\":\"lock_operation_log\",\"createBy\":6455,\"createDt\":\"2018-07-29 13:33:35\",\"updateBy\":6455,\"updateDt\":\"2018-07-29 13:33:35\",\"operationDate\":1532842415586,\"quantity\":1,\"lockDetailId\":1945,\"type\":2,\"operatorId\":6455,\"serialNo\":\"I2018072913332920570819\"},{\"_id\":{\"counter\":2303252,\"date\":\"2018-07-28 17:06:34\",\"machineIdentifier\":15425738,\"processIdentifier\":17,\"time\":1532768794000,\"timeSecond\":1532768794,\"timestamp\":1532768794},\"logId\":58385,\"module\":\"quotation\",\"function\":\"lock_operation_log\",\"createBy\":0,\"createDt\":\"2018-07-28 17:06:34\",\"updateBy\":0,\"updateDt\":\"2018-07-28 17:06:34\",\"operationDate\":1532768794752,\"quantity\":1,\"lockDetailId\":1945,\"type\":9,\"operatorId\":0,\"operationDetail\":\"入库\",\"serialNo\":\"20180720102729193386\"},{\"_id\":{\"counter\":7695035,\"date\":\"2018-07-28 16:15:00\",\"machineIdentifier\":6838857,\"processIdentifier\":17,\"time\":1532765700000,\"timeSecond\":1532765700,\"timestamp\":1532765700},\"logId\":58341,\"module\":\"quotation\",\"function\":\"lock_operation_log\",\"createBy\":961,\"createDt\":\"2018-07-28 16:15:00\",\"updateBy\":961,\"updateDt\":\"2018-07-28 16:15:00\",\"operationDate\":1532765700063,\"lockDetailId\":1945,\"type\":6},{\"_id\":{\"counter\":2303183,\"date\":\"2018-07-28 16:15:00\",\"machineIdentifier\":15425738,\"processIdentifier\":17,\"time\":1532765700000,\"timeSecond\":1532765700,\"timestamp\":1532765700},\"logId\":58335,\"module\":\"quotation\",\"function\":\"lock_operation_log\",\"createBy\":961,\"createDt\":\"2018-07-28 16:15:00\",\"updateBy\":961,\"updateDt\":\"2018-07-28 16:15:00\",\"operationDate\":1532765700063,\"lockDetailId\":1945,\"type\":1,\"operationDetail\":\"审批通过\"},{\"_id\":{\"counter\":2302802,\"date\":\"2018-07-28 14:50:06\",\"machineIdentifier\":15425738,\"processIdentifier\":17,\"time\":1532760606000,\"timeSecond\":1532760606,\"timestamp\":1532760606},\"logId\":58267,\"module\":\"quotation\",\"function\":\"lock_operation_log\",\"createBy\":858,\"createDt\":\"2018-07-28 14:50:06\",\"updateBy\":858,\"updateDt\":\"2018-07-28 14:50:06\",\"operationDate\":1532760606870,\"lockDetailId\":1945,\"type\":1,\"operatorId\":858,\"operationDetail\":\"创建审批\"}],\"resultMessage\":\"\",\"totalCount\":5}";

    }

    @Test
    public void test3() {
        String str = "其他";
        if (str.indexOf("其他") != -1) {
            System.out.println("asdfasdfasdf");
        }
    }

}

package ReadMongoData;

import com.alibaba.fastjson.JSONObject;

import java.io.*;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestMain2 {

    public static void main(String[] args) throws IOException {
        File file = new File("/Users/xujunmeng/Downloads/t_order_buffer.json");

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)))) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                JSONObject jsonObject = JSONObject.parseObject(line);
                Object cityVal = jsonObject.get("city_id");
                if (cityVal != null) {
                    if (cityVal.toString().length() > 4) {
                        System.out.println("city_id : " + cityVal);
                    }
                }
            }
        }
    }

}

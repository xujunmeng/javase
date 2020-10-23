package fastjson;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.annotation.JSONType;
import lombok.Data;

@Data
public class Person {

    @JSONField(name="t_name")
    private String name;

    @JSONField(name="t_age")
    private String age;

    @JSONField(name="t_desc")
    private String desc;

}

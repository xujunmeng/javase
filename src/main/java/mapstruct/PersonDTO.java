package mapstruct;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author james
 * @date 2020/6/30
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonDTO {

    private Long id;
    private String name;
    //对应person.user.age
    private Double age;
    private String email;
    //与DO里面的字段名称(birthDay)不一致
    private Date birth;
    //对DO里面的字段(birthDay)进行拓展，dateFormat的形式
    private String birthDateFormat;
    //对DO里面的字段(birthDay)进行拓展，expression的形式
    private String birthExpressionFormat;

}

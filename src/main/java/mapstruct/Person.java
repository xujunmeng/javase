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
public class Person {

    private Long id;
    private String name;
    private String email;
    private Date birthday;
    private User user;

}

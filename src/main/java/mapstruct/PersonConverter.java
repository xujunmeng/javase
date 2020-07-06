package mapstruct;

import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * @author james
 * @date 2020/6/30
 */
@Mapper
public interface PersonConverter {

    PersonConverter INSTANCE = Mappers.getMapper(PersonConverter.class);

    @Mappings({
            @Mapping(source = "birthday", target = "birth"),
            @Mapping(source = "birthday", target = "birthDateFormat", dateFormat = "yyyy-MM-dd HH:mm:ss"),
            @Mapping(target = "birthExpressionFormat", expression = "java(org.apache.commons.lang3.time.DateFormatUtils.format(person.getBirthday(),\"yyyy-MM-dd HH:mm:ss\"))"),
            @Mapping(source = "user.age", target = "age", qualifiedByName = "formatDoubleAge"),
            @Mapping(source = "email", target = "email", defaultValue = ""),
            @Mapping(target = "id", constant = "22L")
    })
    PersonDTO domain2dto(Person person);

    List<PersonDTO> domain2dtoList(List<Person> persons);

    //需要起个名字，不然报错，可以与方法名一致，当然也可以不一致
    @Named("formatDoubleAge")
    default Double formatDoubleAge(Integer age) {
        if (age == null) {
            return 0.0;
        }
        return Double.valueOf(age);
    }


}

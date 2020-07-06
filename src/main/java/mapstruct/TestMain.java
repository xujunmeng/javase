package mapstruct;

import com.google.common.collect.Lists;

import java.util.Date;
import java.util.List;

/**
 * @author james
 * @date 2020/6/30
 */
public class TestMain {

    public static void main(String[] args) {
        Person person = new Person(1L, "haha", null, new Date(), new User(1));
        PersonDTO personDTO = PersonConverter.INSTANCE.domain2dto(person);

        System.out.println(personDTO);

        List<PersonDTO> personDTOs = PersonConverter.INSTANCE.domain2dtoList(Lists.newArrayList(person));
        System.out.println(personDTOs);

//        Item item = new Item(1L, "苹果");
//        Sku sku = new Sku(2L, "苹果11", 1000);
//        SkuDTO skuDTO = ItemConverter.INSTANCE.domain2dto(item, sku);
//        System.out.println(skuDTO);
    }

}

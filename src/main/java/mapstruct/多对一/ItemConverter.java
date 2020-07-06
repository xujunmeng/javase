//package mapstruct.多对一;
//
//import org.mapstruct.Mapper;
//import org.mapstruct.Mapping;
//import org.mapstruct.Mappings;
//import org.mapstruct.factory.Mappers;
//
///**
// * @author james
// * @date 2020/6/30
// */
//@Mapper
//public interface ItemConverter {
//
//    ItemConverter INSTANCE = Mappers.getMapper(ItemConverter.class);
//
//    @Mappings({
//            @Mapping(source = "sku.id", target = "skuId"),
//            @Mapping(source = "sku.code", target = "skuCode"),
//            @Mapping(source = "sku.price", target = "skuPrice"),
//            @Mapping(source = "item.id", target = "itemId"),
//            @Mapping(source = "item.title", target = "itemName")
//    })
//    SkuDTO domain2dto(Item item, Sku sku);
//
//}

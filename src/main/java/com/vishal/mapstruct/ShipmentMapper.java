package com.vishal.mapstruct;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

/**
 * Created by k.vishal on 11/04/16.
 */
@Mapper
public interface ShipmentMapper {

    ShipmentMapper INSTANCE = Mappers.getMapper(ShipmentMapper.class);

    @Mappings({
            @Mapping(source = "shipmentDao.shipmentId", target = "id"),
            @Mapping(source = "item.itemId", target = "itemId"),
            @Mapping(source = "item.itemName", target = "itemName"),
            @Mapping(source = "item.itemPrice", target = "itemPrice")
    })
    ShipmentDto shipmentDaoToShipmentDto(ShipmentDao shipmentDao, ItemDao item);
}

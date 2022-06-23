package ru.cs.vsu.autoservice.mapper;

import org.mapstruct.Mapper;
import ru.cs.vsu.autoservice.model.dto.OrderListOfPartsDto;
import ru.cs.vsu.autoservice.model.entity.OrderListOfPartsEntity;


public interface OrderListMapper {

    OrderListOfPartsDto toDto (OrderListOfPartsEntity entity);
    OrderListOfPartsEntity toEntity(OrderListOfPartsDto dto);

}

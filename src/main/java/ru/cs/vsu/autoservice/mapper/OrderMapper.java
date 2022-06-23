package ru.cs.vsu.autoservice.mapper;

import org.mapstruct.Mapper;
import ru.cs.vsu.autoservice.model.dto.OrderDto;
import ru.cs.vsu.autoservice.model.entity.OrderEntity;

@Mapper
public interface OrderMapper {

    OrderDto toDto (OrderEntity entity);
    OrderEntity toEntity(OrderDto dto);

}

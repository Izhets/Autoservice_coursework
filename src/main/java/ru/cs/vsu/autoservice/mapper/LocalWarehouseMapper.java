package ru.cs.vsu.autoservice.mapper;

import org.mapstruct.Mapper;
import ru.cs.vsu.autoservice.model.dto.LocalWarehouseDto;
import ru.cs.vsu.autoservice.model.entity.LocalWarehouseEntity;

@Mapper
public interface LocalWarehouseMapper {

    LocalWarehouseDto toDto (LocalWarehouseEntity entity);
    LocalWarehouseEntity toEntity(LocalWarehouseDto dto);

}

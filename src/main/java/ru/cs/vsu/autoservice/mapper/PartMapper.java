package ru.cs.vsu.autoservice.mapper;

import org.mapstruct.Mapper;
import ru.cs.vsu.autoservice.model.dto.PartDto;
import ru.cs.vsu.autoservice.model.entity.PartEntity;

@Mapper
public interface PartMapper {

    PartDto toDto (PartEntity entity);
    PartEntity toEntity(PartDto dto);

}

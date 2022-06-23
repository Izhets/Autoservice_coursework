package ru.cs.vsu.autoservice.mapper;

import org.mapstruct.Mapper;
import ru.cs.vsu.autoservice.model.dto.PartsOnCarDto;
import ru.cs.vsu.autoservice.model.entity.PartsOnCarEntity;

@Mapper
public interface PartsOnCarMapper {

    PartsOnCarDto toDto (PartsOnCarEntity entity);
    PartsOnCarEntity toEntity(PartsOnCarDto dto);

}

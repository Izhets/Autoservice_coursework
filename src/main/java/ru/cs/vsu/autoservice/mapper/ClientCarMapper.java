package ru.cs.vsu.autoservice.mapper;

import org.mapstruct.Mapper;
import ru.cs.vsu.autoservice.model.dto.ClientCarDto;
import ru.cs.vsu.autoservice.model.entity.ClientCarEntity;

@Mapper
public interface ClientCarMapper {

    ClientCarDto toDto (ClientCarEntity entity);
    ClientCarEntity toEntity(ClientCarDto dto);

}

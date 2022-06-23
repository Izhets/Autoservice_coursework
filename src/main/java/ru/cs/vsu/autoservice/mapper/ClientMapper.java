package ru.cs.vsu.autoservice.mapper;

import org.mapstruct.Mapper;
import ru.cs.vsu.autoservice.model.dto.ClientDto;
import ru.cs.vsu.autoservice.model.entity.ClientEntity;

@Mapper
public interface ClientMapper {

    ClientDto toDto (ClientEntity entity);
    ClientEntity toEntity(ClientDto dto);

}

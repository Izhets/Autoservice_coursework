package ru.cs.vsu.autoservice.mapper;

import org.mapstruct.Mapper;
import ru.cs.vsu.autoservice.model.dto.UserDto;
import ru.cs.vsu.autoservice.model.entity.UserEntity;

@Mapper
public interface UserMapper {

    UserDto toDto (UserEntity entity);
    UserEntity toEntity(UserDto dto);

}

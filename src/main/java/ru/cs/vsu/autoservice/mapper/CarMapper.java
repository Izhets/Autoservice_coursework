package ru.cs.vsu.autoservice.mapper;

import org.mapstruct.Mapper;
import ru.cs.vsu.autoservice.model.dto.CarDto;
import ru.cs.vsu.autoservice.model.entity.CarEntity;

@Mapper
public interface CarMapper {

    CarDto toDto (CarEntity entity);
    CarEntity toEntity(CarDto dto);

}

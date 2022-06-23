package ru.cs.vsu.autoservice.mapper;

import org.mapstruct.Mapper;
import ru.cs.vsu.autoservice.model.dto.EmployeeDto;
import ru.cs.vsu.autoservice.model.entity.EmployeeEntity;

@Mapper
public interface EmployeeMapper {

    EmployeeDto toDto (EmployeeEntity entity);
    EmployeeEntity toEntity(EmployeeDto dto);

}

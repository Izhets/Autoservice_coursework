package ru.cs.vsu.autoservice.model.factories;

import org.springframework.stereotype.Component;
import ru.cs.vsu.autoservice.model.dto.CarDto;
import ru.cs.vsu.autoservice.model.dto.PartDto;
import ru.cs.vsu.autoservice.model.entity.CarEntity;
import ru.cs.vsu.autoservice.model.entity.PartEntity;

@Component
public class PartDtoFactory {

    public PartDto makePartDto(PartEntity entity){

        return PartDto.builder()
                .id(entity.getId())
                .name(entity.getName())
                .catalogNumber(entity.getCatalogNumber())
                .type(entity.getType())
                .build();
    }

}

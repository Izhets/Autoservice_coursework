package ru.cs.vsu.autoservice.model.factories;

import org.springframework.stereotype.Component;
import ru.cs.vsu.autoservice.model.dto.CarDto;
import ru.cs.vsu.autoservice.model.entity.CarEntity;

@Component
public class CarDtoFactory {

    public CarDto makeCarDto(CarEntity entity){

        return CarDto.builder()
                .id(entity.getId())
                .brand(entity.getBrand())
                .model(entity.getModel())
                .yearOfManufacture(entity.getYearOfManufacture())
                .build();
    }

}

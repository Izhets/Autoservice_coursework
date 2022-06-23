package ru.cs.vsu.autoservice.service.car;

import org.springframework.stereotype.Service;
import ru.cs.vsu.autoservice.model.dto.CarDto;
import ru.cs.vsu.autoservice.model.entity.CarEntity;
import ru.cs.vsu.autoservice.model.factories.CarDtoFactory;
import ru.cs.vsu.autoservice.repository.car.CarRepository;

@Service
public class CarService {

    private final CarRepository carRepository;
    private final CarDtoFactory carDtoFactory;


    public CarService(CarRepository carRepository, CarDtoFactory carDtoFactory) {
        this.carRepository = carRepository;
        this.carDtoFactory = carDtoFactory;
    }

    public CarDto addCar(CarDto carDto) {

        CarEntity car = carRepository.save(
                CarEntity.builder()
                        .id(carDto.getId())
                        .model(carDto.getModel())
                        .brand(carDto.getBrand())
                        .yearOfManufacture(carDto.getYearOfManufacture())
                        .build()
        );

        return carDtoFactory.makeCarDto(carRepository.save(car));
    }

    public void deleteCar(Long id) {
        carRepository.deleteById(id);
    }
}

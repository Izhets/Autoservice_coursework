package ru.cs.vsu.autoservice.controllers.car;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import ru.cs.vsu.autoservice.model.dto.CarDto;
import ru.cs.vsu.autoservice.service.car.CarService;

@RestController
@RequestMapping("/car")
@PreAuthorize("hasRole('user')")
public class CarController {

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @PostMapping
    public CarDto addCar(@RequestBody CarDto carDto){
        return carService.addCar(carDto);
    }

    @DeleteMapping("/{id}")
    public void deleteCar(@PathVariable Long id){
        carService.deleteCar(id);
    }

}

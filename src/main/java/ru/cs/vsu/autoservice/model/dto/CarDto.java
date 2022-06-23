package ru.cs.vsu.autoservice.model.dto;

import lombok.*;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CarDto {

    @NonNull
    private Long id;
    private String brand;
    private String model;
    private Integer yearOfManufacture;

}

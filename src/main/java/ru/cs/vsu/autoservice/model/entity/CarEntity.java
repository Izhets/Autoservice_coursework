package ru.cs.vsu.autoservice.model.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.MappedCollection;
import org.springframework.data.relational.core.mapping.Table;


/**
 *  CarEntity entity data class.
 *
 * @property [id] is a
 *
 * @author Danila Khnykin
 */
@Table("car")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class CarEntity {

    @Id
    private Long id;
    private String brand;
    private String model;
    private Integer yearOfManufacture;

    @MappedCollection(idColumn = "car_id")
    private ClientCarEntity clientCar;

}

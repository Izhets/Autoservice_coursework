package ru.cs.vsu.autoservice.model.entity;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;


/**
 *  PartsOnCarEntity entity data class.
 *
 * @property [id] is a
 *
 * @author Danila Khnykin
 */
@Table("parts_on_car")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class PartsOnCarEntity {

    @Id
    private Long id;
    private Long carId;
    private Long partId;

}

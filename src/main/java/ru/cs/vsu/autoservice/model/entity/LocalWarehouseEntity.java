package ru.cs.vsu.autoservice.model.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import java.time.LocalDate;


/**
 *  LocalWarehouseEntity entity data class.
 *
 * @property [id] is a
 *
 * @author Danila Khnykin
 */
@Table("local_warehouse")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class LocalWarehouseEntity {

    @Id
    private Long id;
    private Long partId;
    private Integer amount;
    private LocalDate arrivedDate;

}

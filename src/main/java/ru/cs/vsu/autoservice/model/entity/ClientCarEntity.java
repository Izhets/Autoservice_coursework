package ru.cs.vsu.autoservice.model.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;


/**
 *  ClientCarEntity entity data class.
 *
 * @property [id] is a
 *
 * @author Danila Khnykin
 */
@Table("client_car")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class ClientCarEntity {

    @Id
    private Long id;
    private Long carId;
    private Long clientId;

}

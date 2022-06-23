package ru.cs.vsu.autoservice.model.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;


/**
 *  OrderListOfPartsEntity entity data class.
 *
 * @property [id] is a
 *
 * @author Danila Khnykin
 */
@Table("order_list_of_parts")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class OrderListOfPartsEntity {

    @Id
    private Long id;
    private Long orderId;
    private Long partId;

}

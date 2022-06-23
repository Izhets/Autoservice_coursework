package ru.cs.vsu.autoservice.model.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.MappedCollection;
import org.springframework.data.relational.core.mapping.Table;


/**
 *  OrderEntity entity data class.
 *
 * @property [id] is a
 *
 * @author Danila Khnykin
 */
@Table("order")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class OrderEntity {

    @Id
    private Long id;
    private String title;
    private String description;
    private Long clientId;
    private Long employeeId;

    @MappedCollection(idColumn = "order_id")
    private OrderListOfPartsEntity orderListOfParts;

}

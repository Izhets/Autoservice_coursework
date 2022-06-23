package ru.cs.vsu.autoservice.model.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.MappedCollection;
import org.springframework.data.relational.core.mapping.Table;


/**
 *  ClientCarEntity entity data class.
 *
 * @property [id] is a
 *
 * @author Danila Khnykin
 */
@Table("client")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class ClientEntity {

    @Id
    private Long id;
    private Long userId;
    private String phoneNumber;

    @MappedCollection(idColumn = "client_id")
    private ClientCarEntity clientCar;

    @MappedCollection(idColumn = "client_id")
    private OrderEntity order;

}

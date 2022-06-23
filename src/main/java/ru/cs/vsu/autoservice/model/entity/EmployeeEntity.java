package ru.cs.vsu.autoservice.model.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.MappedCollection;
import org.springframework.data.relational.core.mapping.Table;


/**
 *  EmployeeEntity entity data class.
 *
 * @property [id] is a
 *
 * @author Danila Khnykin
 */
@Table("employee")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class EmployeeEntity {

    @Id
    private Long id;
    private Long userId;
    private String role;

    @MappedCollection(idColumn = "employee_id")
    private OrderEntity order;

}

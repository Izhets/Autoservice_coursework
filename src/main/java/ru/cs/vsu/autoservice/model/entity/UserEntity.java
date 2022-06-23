package ru.cs.vsu.autoservice.model.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.MappedCollection;
import org.springframework.data.relational.core.mapping.Table;


/**
 *  UserEntity entity data class.
 *
 * @property [id] is a
 *
 * @author Danila Khnykin
 */
@Table("user")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class UserEntity {

    @Id
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;

    @MappedCollection(idColumn = "user_id")
    private ClientEntity client;

    @MappedCollection(idColumn = "user_id")
    private EmployeeEntity employee;

}

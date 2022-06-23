package ru.cs.vsu.autoservice.model.dto.request.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeCreateRequest {

    //user part
    private String firstName;
    private String lastName;
    private String email;
    private String password;

    //employee part
    private Long userID;
    private String role;

}

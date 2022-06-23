package ru.cs.vsu.autoservice.model.dto.request.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClientCreateRequest {

    //user part
    private String firstName;
    private String lastName;
    private String email;
    private String password;

    //client part
    private Long userID;
    private String phoneNumber;

}

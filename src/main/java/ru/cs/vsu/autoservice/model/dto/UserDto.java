package ru.cs.vsu.autoservice.model.dto;

import lombok.*;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    @NonNull
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;

}

package ru.cs.vsu.autoservice.model.factories;

import org.springframework.stereotype.Component;
import ru.cs.vsu.autoservice.model.dto.request.user.EmployeeCreateRequest;
import ru.cs.vsu.autoservice.model.entity.EmployeeEntity;
import ru.cs.vsu.autoservice.model.entity.UserEntity;

@Component
public class EmployeeCreateRequestFactory {

    public EmployeeCreateRequest makeEmployeeDto(EmployeeEntity entity, UserEntity user){

        return EmployeeCreateRequest.builder()
                .userID(user.getId())
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .email(user.getEmail())
                .password(user.getPassword())
                .role(entity.getRole())
                .build();
    }

}

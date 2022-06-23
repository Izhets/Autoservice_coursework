package ru.cs.vsu.autoservice.model.factories;

import org.springframework.stereotype.Component;
import ru.cs.vsu.autoservice.model.dto.request.user.ClientCreateRequest;
import ru.cs.vsu.autoservice.model.entity.ClientEntity;
import ru.cs.vsu.autoservice.model.entity.UserEntity;

@Component
public class ClientCreateRequestFactory {

    public ClientCreateRequest makeClientDto(ClientEntity entity, UserEntity user){

        return ClientCreateRequest.builder()
                .userID(user.getId())
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .email(user.getEmail())
                .password(user.getPassword())
                .phoneNumber(entity.getPhoneNumber())
                .build();
    }

}

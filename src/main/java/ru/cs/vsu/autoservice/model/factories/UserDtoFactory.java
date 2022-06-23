package ru.cs.vsu.autoservice.model.factories;

import org.springframework.stereotype.Component;
import ru.cs.vsu.autoservice.model.dto.UserDto;
import ru.cs.vsu.autoservice.model.entity.UserEntity;

import java.util.Optional;

@Component
public class UserDtoFactory {

    public UserDto makeUserDto(UserEntity user) {

        return UserDto.builder()
                .firstName(user.getFirstName())
                .lastName(user.getFirstName())
                .email(user.getEmail())
                .password(user.getPassword())
                .build();
    }

    public UserDto getUserDto(UserEntity user) {

        return UserDto.builder()
                .firstName(user.getFirstName())
                .lastName(user.getFirstName())
                .email(user.getEmail())
                .password(user.getPassword())
                .build();
    }



}

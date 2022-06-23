package ru.cs.vsu.autoservice.service.user;

import io.micrometer.core.annotation.Timed;
import org.springframework.stereotype.Service;
import ru.cs.vsu.autoservice.model.dto.UserDto;
import ru.cs.vsu.autoservice.model.entity.UserEntity;
import ru.cs.vsu.autoservice.model.factories.UserDtoFactory;
import ru.cs.vsu.autoservice.repository.user.UserRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final UserDtoFactory userDtoFactory;

    public UserService(UserRepository userRepository, UserDtoFactory userDtoFactory) {
        this.userRepository = userRepository;
        this.userDtoFactory = userDtoFactory;
    }

    @Timed
    public UserDto loadUserById(Long id){
        System.out.println("Getting User by id " + id);
        UserEntity user = userRepository.findById(id).orElseThrow();
        return userDtoFactory.getUserDto(user);
    }

    public UserDto updateUser(Long id, UserDto userDto) {

        Optional<UserEntity> optionalPerson = userRepository.findById(id);
        UserEntity user = optionalPerson.orElseThrow();

        user.setPassword(userDto.getPassword());
        user.setEmail(userDto.getEmail());

        return userDtoFactory.makeUserDto(userRepository.save(user));
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
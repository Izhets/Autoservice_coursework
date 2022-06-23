package ru.cs.vsu.autoservice.controllers.user;

import io.micrometer.core.annotation.Timed;
import org.springframework.web.bind.annotation.*;
import ru.cs.vsu.autoservice.model.dto.UserDto;
import ru.cs.vsu.autoservice.model.entity.UserEntity;
import ru.cs.vsu.autoservice.repository.user.UserRepository;
import ru.cs.vsu.autoservice.service.user.UserService;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserRepository userRepository;
    private final UserService userService;

    public UserController(UserRepository userRepository, UserService userService) {
        this.userRepository = userRepository;
        this.userService = userService;
    }

    @Timed
    @GetMapping("/{userId}")
    public UserDto loadUserById(@PathVariable("userId") Long userId) {
        return userService.loadUserById(userId);
    }

    @PutMapping("/{userId}")
    public UserDto updateUser(@PathVariable Long id, @RequestBody UserDto userDto) {
        return userService.updateUser(id, userDto);
    }

    @DeleteMapping("/{userId}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }

}

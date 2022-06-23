package ru.cs.vsu.autoservice.service.user;

import org.springframework.stereotype.Service;
import ru.cs.vsu.autoservice.model.dto.EmployeeDto;
import ru.cs.vsu.autoservice.model.dto.UserDto;
import ru.cs.vsu.autoservice.model.dto.request.user.EmployeeCreateRequest;
import ru.cs.vsu.autoservice.model.entity.EmployeeEntity;
import ru.cs.vsu.autoservice.model.entity.UserEntity;
import ru.cs.vsu.autoservice.model.factories.EmployeeCreateRequestFactory;
import ru.cs.vsu.autoservice.repository.user.EmployeeRepository;
import ru.cs.vsu.autoservice.repository.user.UserRepository;

@Service
public class EmployeeService {

    private final UserRepository userRepository;
    private final EmployeeRepository employeeRepository;
    private final EmployeeCreateRequestFactory employeeCreateRequestFactory;

    public EmployeeService(UserRepository userRepository, EmployeeRepository employeeRepository, EmployeeCreateRequestFactory employeeCreateRequestFactory) {
        this.userRepository = userRepository;
        this.employeeRepository = employeeRepository;
        this.employeeCreateRequestFactory = employeeCreateRequestFactory;
    }

//    public EmployeeDto loadEmployeeById(Long id){
//        System.out.println("Getting employee by id " + id);
//        EmployeeEntity employee = employeeRepository.findById(id).orElseThrow();
//        return employeeDtoFactory.;
//    }

    public EmployeeCreateRequest createEmployee(EmployeeCreateRequest employeeCreateRequest){

        UserEntity user = userRepository.save(
                UserEntity.builder()
                        .firstName(employeeCreateRequest.getFirstName())
                        .lastName(employeeCreateRequest.getLastName())
                        .email(employeeCreateRequest.getEmail())
                        .password(employeeCreateRequest.getPassword())
                        .build()
        );

        EmployeeEntity employee = employeeRepository.save(
                EmployeeEntity.builder()
                        .userId(user.getId())
                        .role(employeeCreateRequest.getRole())
                        .build()
        );

        return employeeCreateRequestFactory.makeEmployeeDto(employee, user);
    }

}

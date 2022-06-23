package ru.cs.vsu.autoservice.controllers.user;

import org.springframework.web.bind.annotation.*;
import ru.cs.vsu.autoservice.model.dto.EmployeeDto;
import ru.cs.vsu.autoservice.model.dto.UserDto;
import ru.cs.vsu.autoservice.model.dto.request.user.EmployeeCreateRequest;
import ru.cs.vsu.autoservice.service.user.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

//    @GetMapping("/{employeeId}")
//    public EmployeeDto loadEmployeeById(@PathVariable("employeeId") Long employeeId) {
//        return employeeService.loadEmployeeById(employeeId);
//    }

    @PostMapping
    public EmployeeCreateRequest addClient(@RequestBody EmployeeCreateRequest employeeCreateRequest){
        return employeeService.createEmployee(employeeCreateRequest);
    }

}

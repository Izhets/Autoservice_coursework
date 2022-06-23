package ru.cs.vsu.autoservice.model.dto;

import lombok.*;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDto {

    @NonNull
    private Long id;
    private Long userId;

}

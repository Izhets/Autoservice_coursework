package ru.cs.vsu.autoservice.model.dto;

import lombok.*;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderDto {

    @NonNull
    private Long id;
    private Long client_id;
    private Long employee_id;
    private Long orderListOfParts_id;

}

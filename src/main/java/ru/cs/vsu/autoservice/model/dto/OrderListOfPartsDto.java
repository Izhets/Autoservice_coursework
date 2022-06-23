package ru.cs.vsu.autoservice.model.dto;

import lombok.*;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderListOfPartsDto {

    @NonNull
    private Long id;
    private Long order_id;
    private Long part_id;

}

package ru.cs.vsu.autoservice.model.dto;

import lombok.*;

import java.time.LocalDate;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LocalWarehouseDto {

    @NonNull
    private Long id;
    private Long part_id;
    private Integer amount;
    private LocalDate arrivedDate;

}

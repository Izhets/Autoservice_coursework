package ru.cs.vsu.autoservice.model.dto;

import lombok.*;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClientCarDto {

    @NonNull
    private Long id;
    private Long car_id;
    private Long client_id;

}

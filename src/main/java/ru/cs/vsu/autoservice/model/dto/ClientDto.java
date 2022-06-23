package ru.cs.vsu.autoservice.model.dto;

import lombok.*;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClientDto {

    @NonNull
    private Long id;
    private Long userId;
    private String phoneNumber;

}

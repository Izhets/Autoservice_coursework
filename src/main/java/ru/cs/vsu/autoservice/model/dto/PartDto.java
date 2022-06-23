package ru.cs.vsu.autoservice.model.dto;

import lombok.*;
import ru.cs.vsu.autoservice.model.enums.PartTypeEnum;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PartDto {

    @NonNull
    private Long id;
    private String catalogNumber;
    private String name;
    private PartTypeEnum type;

}

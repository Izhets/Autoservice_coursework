package ru.cs.vsu.autoservice.model.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.MappedCollection;
import org.springframework.data.relational.core.mapping.Table;
import ru.cs.vsu.autoservice.model.enums.PartTypeEnum;


/**
 *  PartEntity entity data class.
 *
 * @property [id] is a
 *
 * @author Danila Khnykin
 */
@Table("part")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class PartEntity {

    @Id
    private Long id;
    private String catalogNumber;
    private String name;
    private PartTypeEnum type;

    @MappedCollection(idColumn = "part_id")
    private PartsOnCarEntity partsOnCar;

    @MappedCollection(idColumn = "part_id")
    private LocalWarehouseEntity localWarehouse;

    @MappedCollection(idColumn = "part_id")
    private OrderListOfPartsEntity orderListOfParts;

}

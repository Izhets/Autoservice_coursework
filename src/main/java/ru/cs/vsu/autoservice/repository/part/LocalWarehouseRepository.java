package ru.cs.vsu.autoservice.repository.part;

import org.springframework.data.repository.CrudRepository;
import ru.cs.vsu.autoservice.model.entity.LocalWarehouseEntity;

public interface LocalWarehouseRepository extends CrudRepository<LocalWarehouseEntity, Long> {
}

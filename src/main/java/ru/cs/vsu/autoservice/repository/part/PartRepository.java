package ru.cs.vsu.autoservice.repository.part;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.cs.vsu.autoservice.model.entity.PartEntity;

@Repository
public interface PartRepository extends CrudRepository<PartEntity,Long> {
}

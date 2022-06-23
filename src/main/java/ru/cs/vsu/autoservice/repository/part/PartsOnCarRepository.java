package ru.cs.vsu.autoservice.repository.part;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.cs.vsu.autoservice.model.entity.PartsOnCarEntity;

@Repository
public interface PartsOnCarRepository extends CrudRepository<PartsOnCarEntity, Long> {
}

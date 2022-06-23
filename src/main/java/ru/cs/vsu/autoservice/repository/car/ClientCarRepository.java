package ru.cs.vsu.autoservice.repository.car;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.cs.vsu.autoservice.model.entity.ClientCarEntity;

@Repository
public interface ClientCarRepository extends CrudRepository<ClientCarEntity, Long> {
}

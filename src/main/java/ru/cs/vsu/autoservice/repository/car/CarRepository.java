package ru.cs.vsu.autoservice.repository.car;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.cs.vsu.autoservice.model.entity.CarEntity;

@Repository
public interface CarRepository extends CrudRepository<CarEntity,Long> {
}

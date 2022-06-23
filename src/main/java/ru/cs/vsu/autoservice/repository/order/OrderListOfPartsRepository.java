package ru.cs.vsu.autoservice.repository.order;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.cs.vsu.autoservice.model.entity.OrderListOfPartsEntity;

@Repository
public interface OrderListOfPartsRepository extends CrudRepository<OrderListOfPartsEntity, Long> {
}

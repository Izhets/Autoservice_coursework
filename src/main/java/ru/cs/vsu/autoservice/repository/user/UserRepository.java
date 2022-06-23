package ru.cs.vsu.autoservice.repository.user;

import io.micrometer.core.annotation.Timed;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.cs.vsu.autoservice.model.entity.UserEntity;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Long> {

    @Timed
    Iterable<UserEntity> findAll();
}

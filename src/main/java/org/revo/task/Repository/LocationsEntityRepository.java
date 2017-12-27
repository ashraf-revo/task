package org.revo.task.Repository;

import org.revo.task.Domain.LocationsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationsEntityRepository extends JpaRepository<LocationsEntity,Integer> {
}

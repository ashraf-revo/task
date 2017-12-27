package org.revo.task.Repository;

import org.revo.task.Domain.CountriesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountriesEntityRepository extends JpaRepository<CountriesEntity,String> {
}

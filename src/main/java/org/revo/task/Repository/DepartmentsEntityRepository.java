package org.revo.task.Repository;

import org.revo.task.Domain.DepartmentsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentsEntityRepository extends JpaRepository<DepartmentsEntity, Integer> {
}

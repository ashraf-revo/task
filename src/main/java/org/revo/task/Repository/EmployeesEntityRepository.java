package org.revo.task.Repository;

import org.revo.task.Domain.EmployeesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.List;
import java.util.Optional;

public interface EmployeesEntityRepository extends JpaRepository<EmployeesEntity,Integer> {
    List<EmployeesEntity> findByFirstName(String firstname);

    Optional<EmployeesEntity> findByEmail(String email);
}

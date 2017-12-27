package org.revo.task.Repository;

import org.revo.task.Domain.JobsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JobsEntityRepository extends JpaRepository<JobsEntity, String> {
    List<JobsEntity> findByMinSalaryGreaterThanEqualOrderByMaxSalaryDesc(int minimum);
}

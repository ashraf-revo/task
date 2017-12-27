package org.revo.task.Repository;

import org.revo.task.Domain.JobHistoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Date;

public interface JobHistoryEntityRepository extends JpaRepository<JobHistoryEntity, Integer> {
    JobHistoryEntity findByEmployeeIdAndStartDate(Integer id, Date date);

    @Modifying
    @Transactional
    @Query("update JobHistoryEntity s set s.endDate=?3 , s.jobId=?4 ,s.departmentId=?5 where s.employeeId=?1 and s.startDate=?2")
    void update(Integer integer, Date start, Date end, String jobId, Integer departmentId);
}

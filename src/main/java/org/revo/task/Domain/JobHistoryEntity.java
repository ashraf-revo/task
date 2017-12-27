package org.revo.task.Domain;

import io.swagger.models.auth.In;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "job_history", schema = "task")
@IdClass(JobHistoryEntityPK.class)
public class JobHistoryEntity {
    private int employeeId;
    private Date startDate;
    private Date endDate;
    private String jobId;
    private Integer departmentId;

    public JobHistoryEntity() {
    }

    public JobHistoryEntity(String employeeId, String startDate, String endDate, String jobId, String departmentId) {
        this.employeeId = Integer.valueOf(employeeId);
        String[] split = startDate.split("-");
        String[] split1 = endDate.split("-");
        this.startDate = new Date(Integer.valueOf(split[0]),Integer.valueOf(split[1]),Integer.valueOf(split[2]));
        this.endDate = new Date(Integer.valueOf(split1[0]),Integer.valueOf(split1[1]),Integer.valueOf(split1[2]));
        this.jobId = jobId;
        this.departmentId = Integer.valueOf(departmentId);
    }

    @Id
    @Column(name = "EMPLOYEE_ID", nullable = false, precision = 0)
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    @Id
    @Column(name = "START_DATE", nullable = false)
    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @Basic
    @Column(name = "END_DATE", nullable = false)
    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @Basic
    @Column(name = "JOB_ID", nullable = false, length = 10)
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    @Basic
    @Column(name = "DEPARTMENT_ID", nullable = true, precision = 0)
    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        JobHistoryEntity that = (JobHistoryEntity) o;

        if (employeeId != that.employeeId) return false;
        if (startDate != null ? !startDate.equals(that.startDate) : that.startDate != null) return false;
        if (endDate != null ? !endDate.equals(that.endDate) : that.endDate != null) return false;
        if (jobId != null ? !jobId.equals(that.jobId) : that.jobId != null) return false;
        if (departmentId != null ? !departmentId.equals(that.departmentId) : that.departmentId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = employeeId;
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
        result = 31 * result + (jobId != null ? jobId.hashCode() : 0);
        result = 31 * result + (departmentId != null ? departmentId.hashCode() : 0);
        return result;
    }
}

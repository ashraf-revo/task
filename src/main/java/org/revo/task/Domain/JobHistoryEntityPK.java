package org.revo.task.Domain;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Date;

public class JobHistoryEntityPK implements Serializable {
    private int employeeId;
    private Date startDate;

    @Column(name = "EMPLOYEE_ID", nullable = false, precision = 0)
    @Id
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    @Column(name = "START_DATE", nullable = false)
    @Id
    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        JobHistoryEntityPK that = (JobHistoryEntityPK) o;

        if (employeeId != that.employeeId) return false;
        if (startDate != null ? !startDate.equals(that.startDate) : that.startDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = employeeId;
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        return result;
    }
}

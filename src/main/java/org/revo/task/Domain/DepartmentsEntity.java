package org.revo.task.Domain;

import javax.persistence.*;

@Entity
@Table(name = "departments", schema = "task")
public class DepartmentsEntity {
    //        List<DepartmentsEntity> departmentsEntities = Arrays.asList(new DepartmentsEntity(10, "Administration", 198, 1700),
//                new DepartmentsEntity(20, "Marketing", 201, 1800),
//                new DepartmentsEntity(30, "Purchasing", 114, 1700),
//                new DepartmentsEntity(40, "Human\r\nResources", 203, 2400),
//                new DepartmentsEntity(50, "Shipping", 121, 1500),
//                new DepartmentsEntity(60, "IT", 103, 1400),
//                new DepartmentsEntity(70, "Public\r\nRelations", 204, 2700),
//                new DepartmentsEntity(80, "Sales", 145, 2500),
//                new DepartmentsEntity(90, "Executive", 100, 1700),
//                new DepartmentsEntity(100, "Finance", 108, 1700),
//                new DepartmentsEntity(110, "Accounting", 205, 1700),
//                new DepartmentsEntity(120, "Treasury", 0, 1700),
//                new DepartmentsEntity(130, "Corporate Tax", 0, 1700),
//                new DepartmentsEntity(140, "Control And Credit", 0, 1700),
//                new DepartmentsEntity(150, "Shareholder Services", 0, 1700),
//                new DepartmentsEntity(160, "Benefits", 0, 1700),
//                new DepartmentsEntity(170, "Manufacturing", 0, 1700),
//                new DepartmentsEntity(180, "Construction", 0, 1700),
//                new DepartmentsEntity(190, "Contracting", 0, 1700),
//                new DepartmentsEntity(200, "Operations", 0, 1700),
//                new DepartmentsEntity(210, "IT\r\nSupport", 0, 1700),
//                new DepartmentsEntity(220, "NOC", 0, 1700),
//                new DepartmentsEntity(230, "IT Helpdesk", 0, 1700),
//                new DepartmentsEntity(240, "Government Sales", 0, 1700),
//                new DepartmentsEntity(250, "Retail Sales", 0, 1700),
//                new DepartmentsEntity(260, "Recruiting", 0, 1700),
//                new DepartmentsEntity(270, "Payroll", 0, 1700));
    private int departmentId;
    private String departmentName;
    private Integer managerId;
    private Integer locationId;

    public DepartmentsEntity(String departmentId, String departmentName, String managerId, String locationId) {
        this.departmentId = Integer.valueOf(departmentId);
        this.departmentName = departmentName;
        this.managerId = Integer.valueOf(managerId);
        this.locationId = Integer.valueOf(locationId);
    }

    public DepartmentsEntity() {
    }

    @Id
    @Column(name = "DEPARTMENT_ID", nullable = false, precision = 0)
    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    @Basic
    @Column(name = "DEPARTMENT_NAME", nullable = false, length = 30)
    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    @Basic
    @Column(name = "MANAGER_ID", nullable = true, precision = 0)
    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    @Basic
    @Column(name = "LOCATION_ID", nullable = true, precision = 0)
    public Integer getLocationId() {
        return locationId;
    }

    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DepartmentsEntity that = (DepartmentsEntity) o;

        if (departmentId != that.departmentId) return false;
        if (departmentName != null ? !departmentName.equals(that.departmentName) : that.departmentName != null)
            return false;
        if (managerId != null ? !managerId.equals(that.managerId) : that.managerId != null) return false;
        if (locationId != null ? !locationId.equals(that.locationId) : that.locationId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = departmentId;
        result = 31 * result + (departmentName != null ? departmentName.hashCode() : 0);
        result = 31 * result + (managerId != null ? managerId.hashCode() : 0);
        result = 31 * result + (locationId != null ? locationId.hashCode() : 0);
        return result;
    }
}

package org.revo.task.Domain;

import javax.persistence.*;

@Entity
@Table(name = "regions", schema = "task")
public class RegionsEntity {
    private int regionId;
    private String regionName;

    public RegionsEntity() {
    }

    public RegionsEntity(String regionId, String regionName) {
        this.regionId = Integer.valueOf(regionId);
        this.regionName = regionName;
    }

    @Id
    @Column(name = "REGION_ID", nullable = false, precision = 0)
    public int getRegionId() {
        return regionId;
    }

    public void setRegionId(int regionId) {
        this.regionId = regionId;
    }

    @Basic
    @Column(name = "REGION_NAME", nullable = true, length = 25)
    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RegionsEntity that = (RegionsEntity) o;

        if (regionId != that.regionId) return false;
        if (regionName != null ? !regionName.equals(that.regionName) : that.regionName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = regionId;
        result = 31 * result + (regionName != null ? regionName.hashCode() : 0);
        return result;
    }
}

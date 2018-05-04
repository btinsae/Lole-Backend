/**
 * This file was generated by the Jeddict
 */
package com.fanos.lole.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "working_hours")
public class WorkingHour {

    @Column(name = "working_hour_id", table = "working_hours", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer workingHourId;

    @Column(name = "name_of_day", table = "working_hours", nullable = false, length = 10)
    @Basic(optional = false)
    private String nameOfDay;

    @Column(name = "from_hour", table = "working_hours", nullable = false)
    @Basic(optional = false)
    @Temporal(TemporalType.TIME)
    private Date fromHour;

    @Column(name = "to_hour", table = "working_hours", nullable = false)
    @Basic(optional = false)
    @Temporal(TemporalType.TIME)
    private Date toHour;

    @Column(name = "created_at", table = "working_hours")
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    @Column(name = "updated_at", table = "working_hours")
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;

    @OneToMany(mappedBy = "workingHourId")
    private List<ServiceProvider> serviceProvidersCollection;

    public Integer getWorkingHourId() {
        return this.workingHourId;
    }

    public void setWorkingHourId(Integer workingHourId) {
        this.workingHourId = workingHourId;
    }

    public String getNameOfDay() {
        return this.nameOfDay;
    }

    public void setNameOfDay(String nameOfDay) {
        this.nameOfDay = nameOfDay;
    }

    public Date getFromHour() {
        return this.fromHour;
    }

    public void setFromHour(Date fromHour) {
        this.fromHour = fromHour;
    }

    public Date getToHour() {
        return this.toHour;
    }

    public void setToHour(Date toHour) {
        this.toHour = toHour;
    }

    public Date getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return this.updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public List<ServiceProvider> getServiceProvidersCollection() {
        return this.serviceProvidersCollection;
    }

    public void setServiceProvidersCollection(List<ServiceProvider> serviceProvidersCollection) {
        this.serviceProvidersCollection = serviceProvidersCollection;
    }

}
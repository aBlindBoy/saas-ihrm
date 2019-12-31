package com.ihrm.system.pojo;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "em_user_company")
public class EmUserCompany implements Serializable {

    @Id
    private String userId;
    private String companyId;
    private String departmentId;
    private java.util.Date timeOfEntry;
    private String formOfEmployment;
    private String workNumber;
    private String formOfManagement;
    private String workingCity;
    private java.util.Date correctionTime;
    private Integer inServiceStatus;
    private Integer state;

    public void setUserId(String value) {
        this.userId = value
    }
    public String getUserId() {
       return this.userId
    }
    public void setCompanyId(String value) {
        this.companyId = value
    }
    public String getCompanyId() {
       return this.companyId
    }
    public void setDepartmentId(String value) {
        this.departmentId = value
    }
    public String getDepartmentId() {
       return this.departmentId
    }
    public void setTimeOfEntry(java.util.Date value) {
        this.timeOfEntry = value
    }
    public java.util.Date getTimeOfEntry() {
       return this.timeOfEntry
    }
    public void setFormOfEmployment(String value) {
        this.formOfEmployment = value
    }
    public String getFormOfEmployment() {
       return this.formOfEmployment
    }
    public void setWorkNumber(String value) {
        this.workNumber = value
    }
    public String getWorkNumber() {
       return this.workNumber
    }
    public void setFormOfManagement(String value) {
        this.formOfManagement = value
    }
    public String getFormOfManagement() {
       return this.formOfManagement
    }
    public void setWorkingCity(String value) {
        this.workingCity = value
    }
    public String getWorkingCity() {
       return this.workingCity
    }
    public void setCorrectionTime(java.util.Date value) {
        this.correctionTime = value
    }
    public java.util.Date getCorrectionTime() {
       return this.correctionTime
    }
    public void setInServiceStatus(Integer value) {
        this.inServiceStatus = value
    }
    public Integer getInServiceStatus() {
       return this.inServiceStatus
    }
    public void setState(Integer value) {
        this.state = value
    }
    public Integer getState() {
       return this.state
    }
}

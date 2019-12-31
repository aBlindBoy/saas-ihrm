package com.ihrm.system.pojo;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "bs_user")
public class User implements Serializable {

    @Id
    private String id;
    private String mobile;
    private String username;
    private String password;
    private Integer enableState;
    private java.util.Date createTime;
    @Id
    private String departmentId;
    private java.util.Date timeOfEntry;
    private Integer formOfEmployment;
    private String workNumber;
    private String formOfManagement;
    private String workingCity;
    private java.util.Date correctionTime;
    private Integer inServiceStatus;
    @Id
    private String companyId;
    private String companyName;
    private String departmentName;
    private String level;
    private String staffPhoto;

    public void setId(String value) {
        this.id = value
    }
    public String getId() {
       return this.id
    }
    public void setMobile(String value) {
        this.mobile = value
    }
    public String getMobile() {
       return this.mobile
    }
    public void setUsername(String value) {
        this.username = value
    }
    public String getUsername() {
       return this.username
    }
    public void setPassword(String value) {
        this.password = value
    }
    public String getPassword() {
       return this.password
    }
    public void setEnableState(Integer value) {
        this.enableState = value
    }
    public Integer getEnableState() {
       return this.enableState
    }
    public void setCreateTime(java.util.Date value) {
        this.createTime = value
    }
    public java.util.Date getCreateTime() {
       return this.createTime
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
    public void setFormOfEmployment(Integer value) {
        this.formOfEmployment = value
    }
    public Integer getFormOfEmployment() {
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
    public void setCompanyId(String value) {
        this.companyId = value
    }
    public String getCompanyId() {
       return this.companyId
    }
    public void setCompanyName(String value) {
        this.companyName = value
    }
    public String getCompanyName() {
       return this.companyName
    }
    public void setDepartmentName(String value) {
        this.departmentName = value
    }
    public String getDepartmentName() {
       return this.departmentName
    }
    public void setLevel(String value) {
        this.level = value
    }
    public String getLevel() {
       return this.level
    }
    public void setStaffPhoto(String value) {
        this.staffPhoto = value
    }
    public String getStaffPhoto() {
       return this.staffPhoto
    }
}

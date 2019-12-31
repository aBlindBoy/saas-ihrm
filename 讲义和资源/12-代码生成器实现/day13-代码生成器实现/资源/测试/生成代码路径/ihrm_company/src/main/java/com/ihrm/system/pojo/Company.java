package com.ihrm.system.pojo;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "co_company")
public class Company implements Serializable {

    @Id
    private String id;
    @Id
    private String name;
    @Id
    private String managerId;
    @Id
    private String version;
    @Id
    private java.util.Date renewalDate;
    @Id
    private java.util.Date expirationDate;
    @Id
    private String companyArea;
    @Id
    private String companyAddress;
    @Id
    private String businessLicenseId;
    @Id
    private String legalRepresentative;
    @Id
    private String companyPhone;
    @Id
    private String mailbox;
    @Id
    private String companySize;
    @Id
    private String industry;
    @Id
    private String remarks;
    @Id
    private String auditState;
    @Id
    private Integer state;
    @Id
    private Double balance;
    @Id
    private java.util.Date createTime;

    public void setId(String value) {
        this.id = value
    }
    public String getId() {
       return this.id
    }
    public void setName(String value) {
        this.name = value
    }
    public String getName() {
       return this.name
    }
    public void setManagerId(String value) {
        this.managerId = value
    }
    public String getManagerId() {
       return this.managerId
    }
    public void setVersion(String value) {
        this.version = value
    }
    public String getVersion() {
       return this.version
    }
    public void setRenewalDate(java.util.Date value) {
        this.renewalDate = value
    }
    public java.util.Date getRenewalDate() {
       return this.renewalDate
    }
    public void setExpirationDate(java.util.Date value) {
        this.expirationDate = value
    }
    public java.util.Date getExpirationDate() {
       return this.expirationDate
    }
    public void setCompanyArea(String value) {
        this.companyArea = value
    }
    public String getCompanyArea() {
       return this.companyArea
    }
    public void setCompanyAddress(String value) {
        this.companyAddress = value
    }
    public String getCompanyAddress() {
       return this.companyAddress
    }
    public void setBusinessLicenseId(String value) {
        this.businessLicenseId = value
    }
    public String getBusinessLicenseId() {
       return this.businessLicenseId
    }
    public void setLegalRepresentative(String value) {
        this.legalRepresentative = value
    }
    public String getLegalRepresentative() {
       return this.legalRepresentative
    }
    public void setCompanyPhone(String value) {
        this.companyPhone = value
    }
    public String getCompanyPhone() {
       return this.companyPhone
    }
    public void setMailbox(String value) {
        this.mailbox = value
    }
    public String getMailbox() {
       return this.mailbox
    }
    public void setCompanySize(String value) {
        this.companySize = value
    }
    public String getCompanySize() {
       return this.companySize
    }
    public void setIndustry(String value) {
        this.industry = value
    }
    public String getIndustry() {
       return this.industry
    }
    public void setRemarks(String value) {
        this.remarks = value
    }
    public String getRemarks() {
       return this.remarks
    }
    public void setAuditState(String value) {
        this.auditState = value
    }
    public String getAuditState() {
       return this.auditState
    }
    public void setState(Integer value) {
        this.state = value
    }
    public Integer getState() {
       return this.state
    }
    public void setBalance(Double value) {
        this.balance = value
    }
    public Double getBalance() {
       return this.balance
    }
    public void setCreateTime(java.util.Date value) {
        this.createTime = value
    }
    public java.util.Date getCreateTime() {
       return this.createTime
    }
}

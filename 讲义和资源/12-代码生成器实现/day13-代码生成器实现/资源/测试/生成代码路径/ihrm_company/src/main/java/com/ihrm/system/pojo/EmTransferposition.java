package com.ihrm.system.pojo;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "em_transferposition")
public class EmTransferposition implements Serializable {

    @Id
    private String userId;
    private String post;
    private String rank;
    private String reportingObject;
    private String hrbp;
    private java.util.Date adjustmentTime;
    private String causeOfAdjustingPost;
    private String enclosure;
    private String formOfManagement;
    private String workingCity;
    private String taxableCity;
    private String currentContractStartTime;
    private String closingTimeOfCurrentContract;
    private String workingPlace;
    private String initialContractStartTime;
    private String firstContractTerminationTime;
    private String contractPeriod;
    private Integer renewalNumber;
    private String recommenderBusinessPeople;
    private Integer estatus;
    private java.util.Date createTime;

    public void setUserId(String value) {
        this.userId = value
    }
    public String getUserId() {
       return this.userId
    }
    public void setPost(String value) {
        this.post = value
    }
    public String getPost() {
       return this.post
    }
    public void setRank(String value) {
        this.rank = value
    }
    public String getRank() {
       return this.rank
    }
    public void setReportingObject(String value) {
        this.reportingObject = value
    }
    public String getReportingObject() {
       return this.reportingObject
    }
    public void setHrbp(String value) {
        this.hrbp = value
    }
    public String getHrbp() {
       return this.hrbp
    }
    public void setAdjustmentTime(java.util.Date value) {
        this.adjustmentTime = value
    }
    public java.util.Date getAdjustmentTime() {
       return this.adjustmentTime
    }
    public void setCauseOfAdjustingPost(String value) {
        this.causeOfAdjustingPost = value
    }
    public String getCauseOfAdjustingPost() {
       return this.causeOfAdjustingPost
    }
    public void setEnclosure(String value) {
        this.enclosure = value
    }
    public String getEnclosure() {
       return this.enclosure
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
    public void setTaxableCity(String value) {
        this.taxableCity = value
    }
    public String getTaxableCity() {
       return this.taxableCity
    }
    public void setCurrentContractStartTime(String value) {
        this.currentContractStartTime = value
    }
    public String getCurrentContractStartTime() {
       return this.currentContractStartTime
    }
    public void setClosingTimeOfCurrentContract(String value) {
        this.closingTimeOfCurrentContract = value
    }
    public String getClosingTimeOfCurrentContract() {
       return this.closingTimeOfCurrentContract
    }
    public void setWorkingPlace(String value) {
        this.workingPlace = value
    }
    public String getWorkingPlace() {
       return this.workingPlace
    }
    public void setInitialContractStartTime(String value) {
        this.initialContractStartTime = value
    }
    public String getInitialContractStartTime() {
       return this.initialContractStartTime
    }
    public void setFirstContractTerminationTime(String value) {
        this.firstContractTerminationTime = value
    }
    public String getFirstContractTerminationTime() {
       return this.firstContractTerminationTime
    }
    public void setContractPeriod(String value) {
        this.contractPeriod = value
    }
    public String getContractPeriod() {
       return this.contractPeriod
    }
    public void setRenewalNumber(Integer value) {
        this.renewalNumber = value
    }
    public Integer getRenewalNumber() {
       return this.renewalNumber
    }
    public void setRecommenderBusinessPeople(String value) {
        this.recommenderBusinessPeople = value
    }
    public String getRecommenderBusinessPeople() {
       return this.recommenderBusinessPeople
    }
    public void setEstatus(Integer value) {
        this.estatus = value
    }
    public Integer getEstatus() {
       return this.estatus
    }
    public void setCreateTime(java.util.Date value) {
        this.createTime = value
    }
    public java.util.Date getCreateTime() {
       return this.createTime
    }
}

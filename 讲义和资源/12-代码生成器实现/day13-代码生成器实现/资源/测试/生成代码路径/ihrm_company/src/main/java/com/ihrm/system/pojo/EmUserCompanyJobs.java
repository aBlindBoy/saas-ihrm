package com.ihrm.system.pojo;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "em_user_company_jobs")
public class EmUserCompanyJobs implements Serializable {

    @Id
    private String userId;
    private String companyId;
    private String post;
    private String workMailbox;
    private String rank;
    private String correctionEvaluation;
    private String reportId;
    private String reportName;
    private String stateOfCorrection;
    private String hrbp;
    private String workingTimeForTheFirstTime;
    private Integer adjustmentAgedays;
    private Integer adjustmentOfLengthOfService;
    private String workingCity;
    private String taxableCity;
    private String currentContractStartTime;
    private String closingTimeOfCurrentContract;
    private String initialContractStartTime;
    private String firstContractTerminationTime;
    private String contractPeriod;
    private String contractDocuments;
    private Integer renewalNumber;
    private String otherRecruitmentChannels;
    private String recruitmentChannels;
    private String socialRecruitment;
    private String recommenderBusinessPeople;

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
    public void setPost(String value) {
        this.post = value
    }
    public String getPost() {
       return this.post
    }
    public void setWorkMailbox(String value) {
        this.workMailbox = value
    }
    public String getWorkMailbox() {
       return this.workMailbox
    }
    public void setRank(String value) {
        this.rank = value
    }
    public String getRank() {
       return this.rank
    }
    public void setCorrectionEvaluation(String value) {
        this.correctionEvaluation = value
    }
    public String getCorrectionEvaluation() {
       return this.correctionEvaluation
    }
    public void setReportId(String value) {
        this.reportId = value
    }
    public String getReportId() {
       return this.reportId
    }
    public void setReportName(String value) {
        this.reportName = value
    }
    public String getReportName() {
       return this.reportName
    }
    public void setStateOfCorrection(String value) {
        this.stateOfCorrection = value
    }
    public String getStateOfCorrection() {
       return this.stateOfCorrection
    }
    public void setHrbp(String value) {
        this.hrbp = value
    }
    public String getHrbp() {
       return this.hrbp
    }
    public void setWorkingTimeForTheFirstTime(String value) {
        this.workingTimeForTheFirstTime = value
    }
    public String getWorkingTimeForTheFirstTime() {
       return this.workingTimeForTheFirstTime
    }
    public void setAdjustmentAgedays(Integer value) {
        this.adjustmentAgedays = value
    }
    public Integer getAdjustmentAgedays() {
       return this.adjustmentAgedays
    }
    public void setAdjustmentOfLengthOfService(Integer value) {
        this.adjustmentOfLengthOfService = value
    }
    public Integer getAdjustmentOfLengthOfService() {
       return this.adjustmentOfLengthOfService
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
    public void setContractDocuments(String value) {
        this.contractDocuments = value
    }
    public String getContractDocuments() {
       return this.contractDocuments
    }
    public void setRenewalNumber(Integer value) {
        this.renewalNumber = value
    }
    public Integer getRenewalNumber() {
       return this.renewalNumber
    }
    public void setOtherRecruitmentChannels(String value) {
        this.otherRecruitmentChannels = value
    }
    public String getOtherRecruitmentChannels() {
       return this.otherRecruitmentChannels
    }
    public void setRecruitmentChannels(String value) {
        this.recruitmentChannels = value
    }
    public String getRecruitmentChannels() {
       return this.recruitmentChannels
    }
    public void setSocialRecruitment(String value) {
        this.socialRecruitment = value
    }
    public String getSocialRecruitment() {
       return this.socialRecruitment
    }
    public void setRecommenderBusinessPeople(String value) {
        this.recommenderBusinessPeople = value
    }
    public String getRecommenderBusinessPeople() {
       return this.recommenderBusinessPeople
    }
}

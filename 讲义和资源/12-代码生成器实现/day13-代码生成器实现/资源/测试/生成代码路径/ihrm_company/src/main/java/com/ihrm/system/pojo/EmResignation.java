package com.ihrm.system.pojo;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "em_resignation")
public class EmResignation implements Serializable {

    @Id
    private String userId;
    private String resignationTime;
    private String typeOfTurnover;
    private String reasonsForLeaving;
    private String compensation;
    private String notifications;
    private String socialSecurityReductionMonth;
    private String providentFundReductionMonth;
    private String picture;
    private java.util.Date createTime;

    public void setUserId(String value) {
        this.userId = value
    }
    public String getUserId() {
       return this.userId
    }
    public void setResignationTime(String value) {
        this.resignationTime = value
    }
    public String getResignationTime() {
       return this.resignationTime
    }
    public void setTypeOfTurnover(String value) {
        this.typeOfTurnover = value
    }
    public String getTypeOfTurnover() {
       return this.typeOfTurnover
    }
    public void setReasonsForLeaving(String value) {
        this.reasonsForLeaving = value
    }
    public String getReasonsForLeaving() {
       return this.reasonsForLeaving
    }
    public void setCompensation(String value) {
        this.compensation = value
    }
    public String getCompensation() {
       return this.compensation
    }
    public void setNotifications(String value) {
        this.notifications = value
    }
    public String getNotifications() {
       return this.notifications
    }
    public void setSocialSecurityReductionMonth(String value) {
        this.socialSecurityReductionMonth = value
    }
    public String getSocialSecurityReductionMonth() {
       return this.socialSecurityReductionMonth
    }
    public void setProvidentFundReductionMonth(String value) {
        this.providentFundReductionMonth = value
    }
    public String getProvidentFundReductionMonth() {
       return this.providentFundReductionMonth
    }
    public void setPicture(String value) {
        this.picture = value
    }
    public String getPicture() {
       return this.picture
    }
    public void setCreateTime(java.util.Date value) {
        this.createTime = value
    }
    public java.util.Date getCreateTime() {
       return this.createTime
    }
}

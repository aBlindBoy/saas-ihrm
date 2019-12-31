package com.ihrm.system.pojo;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "em_positive")
public class EmPositive implements Serializable {

    @Id
    private String userId;
    private java.util.Date dateOfCorrection;
    private String correctionEvaluation;
    private String enclosure;
    private Integer estatus;
    private java.util.Date createTime;

    public void setUserId(String value) {
        this.userId = value
    }
    public String getUserId() {
       return this.userId
    }
    public void setDateOfCorrection(java.util.Date value) {
        this.dateOfCorrection = value
    }
    public java.util.Date getDateOfCorrection() {
       return this.dateOfCorrection
    }
    public void setCorrectionEvaluation(String value) {
        this.correctionEvaluation = value
    }
    public String getCorrectionEvaluation() {
       return this.correctionEvaluation
    }
    public void setEnclosure(String value) {
        this.enclosure = value
    }
    public String getEnclosure() {
       return this.enclosure
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

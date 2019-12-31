package com.ihrm.system.pojo;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "em_archive")
public class EmArchive implements Serializable {

    @Id
    private String id;
    private String opUser;
    private String month;
    @Id
    private String companyId;
    private Integer totals;
    private Integer payrolls;
    private Integer departures;
    private String data;
    private java.util.Date createTime;

    public void setId(String value) {
        this.id = value
    }
    public String getId() {
       return this.id
    }
    public void setOpUser(String value) {
        this.opUser = value
    }
    public String getOpUser() {
       return this.opUser
    }
    public void setMonth(String value) {
        this.month = value
    }
    public String getMonth() {
       return this.month
    }
    public void setCompanyId(String value) {
        this.companyId = value
    }
    public String getCompanyId() {
       return this.companyId
    }
    public void setTotals(Integer value) {
        this.totals = value
    }
    public Integer getTotals() {
       return this.totals
    }
    public void setPayrolls(Integer value) {
        this.payrolls = value
    }
    public Integer getPayrolls() {
       return this.payrolls
    }
    public void setDepartures(Integer value) {
        this.departures = value
    }
    public Integer getDepartures() {
       return this.departures
    }
    public void setData(String value) {
        this.data = value
    }
    public String getData() {
       return this.data
    }
    public void setCreateTime(java.util.Date value) {
        this.createTime = value
    }
    public java.util.Date getCreateTime() {
       return this.createTime
    }
}

package com.ihrm.system.pojo;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "co_transaction_record")
public class TransactionRecord implements Serializable {

    @Id
    private String id;
    @Id
    private String companyId;
    @Id
    private String userId;
    private Integer type;
    private Double amount;
    private Double balance;
    private String note;
    private java.util.Date createTime;

    public void setId(String value) {
        this.id = value
    }
    public String getId() {
       return this.id
    }
    public void setCompanyId(String value) {
        this.companyId = value
    }
    public String getCompanyId() {
       return this.companyId
    }
    public void setUserId(String value) {
        this.userId = value
    }
    public String getUserId() {
       return this.userId
    }
    public void setType(Integer value) {
        this.type = value
    }
    public Integer getType() {
       return this.type
    }
    public void setAmount(Double value) {
        this.amount = value
    }
    public Double getAmount() {
       return this.amount
    }
    public void setBalance(Double value) {
        this.balance = value
    }
    public Double getBalance() {
       return this.balance
    }
    public void setNote(String value) {
        this.note = value
    }
    public String getNote() {
       return this.note
    }
    public void setCreateTime(java.util.Date value) {
        this.createTime = value
    }
    public java.util.Date getCreateTime() {
       return this.createTime
    }
}

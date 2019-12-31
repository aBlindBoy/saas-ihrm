package com.ihrm.system.pojo;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "co_department")
public class Department implements Serializable {

    @Id
    private String id;
    @Id
    private String companyId;
    @Id
    private String pid;
    private String name;
    private String code;
    private String manager;
    private String introduce;
    private java.util.Date createTime;
    @Id
    private String managerId;

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
    public void setPid(String value) {
        this.pid = value
    }
    public String getPid() {
       return this.pid
    }
    public void setName(String value) {
        this.name = value
    }
    public String getName() {
       return this.name
    }
    public void setCode(String value) {
        this.code = value
    }
    public String getCode() {
       return this.code
    }
    public void setManager(String value) {
        this.manager = value
    }
    public String getManager() {
       return this.manager
    }
    public void setIntroduce(String value) {
        this.introduce = value
    }
    public String getIntroduce() {
       return this.introduce
    }
    public void setCreateTime(java.util.Date value) {
        this.createTime = value
    }
    public java.util.Date getCreateTime() {
       return this.createTime
    }
    public void setManagerId(String value) {
        this.managerId = value
    }
    public String getManagerId() {
       return this.managerId
    }
}

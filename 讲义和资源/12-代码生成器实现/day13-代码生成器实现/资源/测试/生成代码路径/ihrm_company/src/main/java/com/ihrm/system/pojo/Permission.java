package com.ihrm.system.pojo;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "pe_permission")
public class Permission implements Serializable {

    @Id
    private String id;
    private String description;
    private String name;
    private Integer type;
    @Id
    private String pid;
    private String code;
    private Integer enVisible;

    public void setId(String value) {
        this.id = value
    }
    public String getId() {
       return this.id
    }
    public void setDescription(String value) {
        this.description = value
    }
    public String getDescription() {
       return this.description
    }
    public void setName(String value) {
        this.name = value
    }
    public String getName() {
       return this.name
    }
    public void setType(Integer value) {
        this.type = value
    }
    public Integer getType() {
       return this.type
    }
    public void setPid(String value) {
        this.pid = value
    }
    public String getPid() {
       return this.pid
    }
    public void setCode(String value) {
        this.code = value
    }
    public String getCode() {
       return this.code
    }
    public void setEnVisible(Integer value) {
        this.enVisible = value
    }
    public Integer getEnVisible() {
       return this.enVisible
    }
}

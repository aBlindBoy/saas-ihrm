package com.ihrm.system.pojo;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "pe_permission_point")
public class PermissionPoint implements Serializable {

    @Id
    private String id;
    private String pointClass;
    private String pointIcon;
    private Integer pointStatus;

    public void setId(String value) {
        this.id = value
    }
    public String getId() {
       return this.id
    }
    public void setPointClass(String value) {
        this.pointClass = value
    }
    public String getPointClass() {
       return this.pointClass
    }
    public void setPointIcon(String value) {
        this.pointIcon = value
    }
    public String getPointIcon() {
       return this.pointIcon
    }
    public void setPointStatus(Integer value) {
        this.pointStatus = value
    }
    public Integer getPointStatus() {
       return this.pointStatus
    }
}

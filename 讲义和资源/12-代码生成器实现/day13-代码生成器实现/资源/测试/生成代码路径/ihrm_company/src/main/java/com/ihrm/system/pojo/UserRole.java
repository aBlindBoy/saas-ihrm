package com.ihrm.system.pojo;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "pe_user_role")
public class UserRole implements Serializable {

    @Id
    private String roleId;
    @Id
    private String userId;

    public void setRoleId(String value) {
        this.roleId = value
    }
    public String getRoleId() {
       return this.roleId
    }
    public void setUserId(String value) {
        this.userId = value
    }
    public String getUserId() {
       return this.userId
    }
}

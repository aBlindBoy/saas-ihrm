package com.ihrm.system.pojo;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "pe_role_permission")
public class RolePermission implements Serializable {

    @Id
    private String roleId;
    @Id
    private String permissionId;

    public void setRoleId(String value) {
        this.roleId = value
    }
    public String getRoleId() {
       return this.roleId
    }
    public void setPermissionId(String value) {
        this.permissionId = value
    }
    public String getPermissionId() {
       return this.permissionId
    }
}

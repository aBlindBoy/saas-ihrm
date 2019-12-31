package com.ihrm.system.pojo;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "pe_permission_menu")
public class PermissionMenu implements Serializable {

    @Id
    private String id;
    private String menuIcon;
    private String menuOrder;

    public void setId(String value) {
        this.id = value
    }
    public String getId() {
       return this.id
    }
    public void setMenuIcon(String value) {
        this.menuIcon = value
    }
    public String getMenuIcon() {
       return this.menuIcon
    }
    public void setMenuOrder(String value) {
        this.menuOrder = value
    }
    public String getMenuOrder() {
       return this.menuOrder
    }
}

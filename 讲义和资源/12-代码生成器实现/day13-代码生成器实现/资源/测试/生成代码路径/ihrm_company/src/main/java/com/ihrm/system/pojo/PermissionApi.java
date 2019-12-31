package com.ihrm.system.pojo;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "pe_permission_api")
public class PermissionApi implements Serializable {

    @Id
    private String id;
    private String apiLevel;
    private String apiMethod;
    private String apiUrl;

    public void setId(String value) {
        this.id = value
    }
    public String getId() {
       return this.id
    }
    public void setApiLevel(String value) {
        this.apiLevel = value
    }
    public String getApiLevel() {
       return this.apiLevel
    }
    public void setApiMethod(String value) {
        this.apiMethod = value
    }
    public String getApiMethod() {
       return this.apiMethod
    }
    public void setApiUrl(String value) {
        this.apiUrl = value
    }
    public String getApiUrl() {
       return this.apiUrl
    }
}

package com.ihrm.system.pojo;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "sys_settings")
public class SysSettings implements Serializable {

    @Id
    private String companyId;
    private Integer settingsType;
    private String settingsInfo;

    public void setCompanyId(String value) {
        this.companyId = value
    }
    public String getCompanyId() {
       return this.companyId
    }
    public void setSettingsType(Integer value) {
        this.settingsType = value
    }
    public Integer getSettingsType() {
       return this.settingsType
    }
    public void setSettingsInfo(String value) {
        this.settingsInfo = value
    }
    public String getSettingsInfo() {
       return this.settingsInfo
    }
}

package com.ihrm.system.pojo;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "pe_role")
public class Role implements Serializable {

    @Id
    private String id;
    private String name;
    private String description;
    @Id
    private String companyId;

    public void setId(String value) {
        this.id = value
    }
    public String getId() {
       return this.id
    }
    public void setName(String value) {
        this.name = value
    }
    public String getName() {
       return this.name
    }
    public void setDescription(String value) {
        this.description = value
    }
    public String getDescription() {
       return this.description
    }
    public void setCompanyId(String value) {
        this.companyId = value
    }
    public String getCompanyId() {
       return this.companyId
    }
}

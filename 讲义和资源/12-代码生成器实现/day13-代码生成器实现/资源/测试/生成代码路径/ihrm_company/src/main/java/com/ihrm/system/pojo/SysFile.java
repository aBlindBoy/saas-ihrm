package com.ihrm.system.pojo;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "sys_file")
public class SysFile implements Serializable {

    @Id
    private String id;
    private String fileName;
    private String path;
    @Id
    private String uuidName;
    private Integer type;
    private java.util.Date createTime;

    public void setId(String value) {
        this.id = value
    }
    public String getId() {
       return this.id
    }
    public void setFileName(String value) {
        this.fileName = value
    }
    public String getFileName() {
       return this.fileName
    }
    public void setPath(String value) {
        this.path = value
    }
    public String getPath() {
       return this.path
    }
    public void setUuidName(String value) {
        this.uuidName = value
    }
    public String getUuidName() {
       return this.uuidName
    }
    public void setType(Integer value) {
        this.type = value
    }
    public Integer getType() {
       return this.type
    }
    public void setCreateTime(java.util.Date value) {
        this.createTime = value
    }
    public java.util.Date getCreateTime() {
       return this.createTime
    }
}

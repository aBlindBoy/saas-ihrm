package cn.itcast.generate.entity;

import cn.itcast.generate.utils.StringUtils;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class Settings {

    private String project="example";
    private String pPackage="com.example.demo";
    private String projectComment;
    private String author;
    private String path1="com";
    private String path2="example";
    private String path3="demo";
    private String pathAll;

    public Settings(String project, String pPackage, String projectComment, String author) {
        if(StringUtils.isNotBlank(project)) {
            this.project = project;
        }
        if(StringUtils.isNotBlank(pPackage)) {
            this.pPackage = pPackage;
        }
        this.projectComment = projectComment;
        this.author = author;
        String[] paths = pPackage.split("\\.");
        path1 = paths[0];
        path2 = paths.length>1?paths[1]:path2;
        path3 = paths.length>2?paths[2]:path3;
        pathAll = pPackage.replaceAll(".","/");
    }

    public Map<String, Object> getSettingMap(){
        Map<String, Object> map = new HashMap<>();
        Field[] declaredFields = Settings.class.getDeclaredFields();
        for (Field field : declaredFields) {
            field.setAccessible(true);
            try{
                map.put(field.getName(), field.get(this));
            }catch (Exception e){}
        }
        return map;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getpPackage() {
        return pPackage;
    }

    public void setpPackage(String pPackage) {
        this.pPackage = pPackage;
    }

    public String getProjectComment() {
        return projectComment;
    }

    public void setProjectComment(String projectComment) {
        this.projectComment = projectComment;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPath1() {
        return path1;
    }

    public void setPath1(String path1) {
        this.path1 = path1;
    }

    public String getPath2() {
        return path2;
    }

    public void setPath2(String path2) {
        this.path2 = path2;
    }

    public String getPath3() {
        return path3;
    }

    public void setPath3(String path3) {
        this.path3 = path3;
    }

    public String getPathAll() {
        return pathAll;
    }

    public void setPathAll(String pathAll) {
        this.pathAll = pathAll;
    }
}

package com.ihrm.common.controller;

import org.springframework.web.bind.annotation.ModelAttribute;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BaseController {

    protected HttpServletRequest request;

    protected HttpServletResponse response;

    protected String companyId;
    protected String companyName;
    @ModelAttribute
    public void reqAndRes(HttpServletRequest request,HttpServletResponse response,String companyId){
        this.request = request;
        this.response =response;
        this.companyId = "1";
        this.companyName = "传智播客";
       // this.companyId =companyId;
    }






}

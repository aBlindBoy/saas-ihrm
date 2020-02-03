package com.ihrm.common.controller;

import com.ihrm.domain.system.response.ProfileResult;
import io.jsonwebtoken.Claims;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BaseController {

    protected HttpServletRequest request;

    protected HttpServletResponse response;

    protected String companyId;
    protected String companyName;

    protected Claims claims;

    @ModelAttribute
    public void reqAndRes(HttpServletRequest request,HttpServletResponse response,String companyId){
        this.request = request;
        this.response =response;
        Subject subject = SecurityUtils.getSubject ();
        PrincipalCollection principals = subject.getPrincipals ();
        if (principals!=null && !principals.isEmpty ()){
            ProfileResult profileResult=(ProfileResult)principals.getPrimaryPrincipal ();
            this.companyId=profileResult.getCompanyId ();
            this.companyName=profileResult.getCompany ();
        }
//        Object obj = request.getAttribute ( "user_claims" );
//        if(obj != null) {
//            this.claims = (Claims) obj;
//            this.companyId = (String)claims.get("companyId");
//            this.companyName = (String)claims.get("companyName");
//        }
//        this.companyId = "1";
//        this.companyName = "传智播客";
       // this.companyId =companyId;
    }






}

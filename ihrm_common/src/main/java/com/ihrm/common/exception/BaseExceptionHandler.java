package com.ihrm.common.exception;

import com.ihrm.common.entity.Result;
import com.ihrm.common.entity.ResultCode;
import org.apache.shiro.authz.AuthorizationException;
import org.apache.shiro.authz.UnauthorizedException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@ControllerAdvice
public class BaseExceptionHandler {


    /**
     * 未授权
     */

    @ExceptionHandler(value = UnauthorizedException.class)
    @ResponseBody
    public Result error(HttpServletRequest request, HttpServletResponse response,AuthorizationException e) {
        return new Result(ResultCode.UNAUTHORISE);
    }
 /*   *//**
     * 未登录
     *//*
    @ExceptionHandler(value = AuthorizationException.class)
    public Result unauthorizedExceptionError(HttpServletRequest request, HttpServletResponse response,AuthorizationException e) {
      return new Result ( ResultCode.UNAUTHENTICATED );
    }*/

    @ExceptionHandler(value = Exception.class)
    public ResponseEntity<Result> error( Exception e, HttpServletRequest request, HttpServletResponse response ){
        if (e.getClass () == CommonException.class){
            CommonException ce=(CommonException)e;
            return ResponseEntity.status ( 500 ).body ( new Result(ce.getResultCode ()) );
        }else{
            return ResponseEntity.status ( 500 ).body ( new Result ( ResultCode.SERVER_ERROR ) );
        }
    }
}

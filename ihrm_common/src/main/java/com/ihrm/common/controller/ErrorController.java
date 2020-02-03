package com.ihrm.common.controller;

import com.ihrm.common.entity.Result;
import com.ihrm.common.entity.ResultCode;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class ErrorController {


    //公共shiro认证错误处理
    @RequestMapping("/autherror")
    public Result autherror(int code){
        System.out.println ("--------------------------");
        return code == 1?new Result ( ResultCode.UNAUTHENTICATED ):new Result ( ResultCode.UNAUTHORISE );
    }


}

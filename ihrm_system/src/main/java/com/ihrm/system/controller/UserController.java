package com.ihrm.system.controller;

import com.ihrm.common.controller.BaseController;
import com.ihrm.common.entity.PageResult;
import com.ihrm.common.entity.Result;
import com.ihrm.common.entity.ResultCode;

import com.ihrm.domain.system.User;
import com.ihrm.system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("/sys")
public class UserController extends BaseController {

    @Autowired
    private UserService userService;


    /**
     * 保存
     */
    @RequestMapping(value="/user",method = RequestMethod.POST)
    public Result save( @RequestBody User user) {
        //1.设置保存的企业id
        /**
         * 企业id：目前使用固定值1，以后会解决
         */
        user.setCompanyName ( companyName );
        //2.调用service完成保存企业
        userService.add(user);
        //3.构造返回结果
        return new Result(ResultCode.SUCCESS);
    }

    /**
     * 查询企业的部门列表
     * 指定企业id
     */
    @RequestMapping(value="/user",method = RequestMethod.GET)
    public Result findAll( int page, int size, @RequestParam Map map ) {
        System.out.println (page);
        map.put ( "companyId",companyId);
        map.put ( "departmentId", "1066240656856453120" );
        Page users = userService.findAll ( map, page, size );

        PageResult pageResult=new PageResult<> ( users.getTotalElements (),users.getContent () );
        System.out.println (users.getContent ());
        return new Result(ResultCode.SUCCESS,pageResult);
    }

    /**
     * 根据ID查询user
     */
    @RequestMapping(value="/user/{id}",method = RequestMethod.GET)
    public Result findById(@PathVariable(value="id") String id) {
        User user = userService.findById(id);
        return new Result(ResultCode.SUCCESS,user);
    }

    /**
     * 修改User
     */
    @RequestMapping(value="/user/{id}",method = RequestMethod.PUT)
    public Result update(@PathVariable(value="id") String id,@RequestBody User user) {
        //1.设置修改的部门id
        user.setId(id);
        //2.调用service更新
        userService.update(user);
        return new Result(ResultCode.SUCCESS);
    }

    /**
     * 根据id删除
     */
    @RequestMapping(value="/user/{id}",method = RequestMethod.DELETE)
    public Result delete(@PathVariable(value="id") String id) {
        userService.delete (id);
        return new Result(ResultCode.SUCCESS);
    }









}

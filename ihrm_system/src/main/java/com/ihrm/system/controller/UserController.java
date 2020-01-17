package com.ihrm.system.controller;

import com.ihrm.common.controller.BaseController;
import com.ihrm.common.entity.PageResult;
import com.ihrm.common.entity.Result;
import com.ihrm.common.entity.ResultCode;

import com.ihrm.common.exception.CommonException;
import com.ihrm.common.utils.JwtUtils;
import com.ihrm.domain.system.User;
import com.ihrm.domain.system.response.ProfileResult;
import com.ihrm.domain.system.response.UserResult;
import com.ihrm.system.service.UserService;
import io.jsonwebtoken.Claims;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("/sys")
public class UserController extends BaseController {

    @Autowired
    private UserService userService;


    @Autowired
    private JwtUtils jwtUtils;


    /**
     * 登录获取token
     * @param loginMap
     * @return
     */
    @PostMapping("login")
    public Result login(@RequestBody Map<String,String> loginMap){
        String mobile = loginMap.get ( "mobile" );
        String password = loginMap.get ( "password" );
        User user = userService.findByMobile(mobile);
        System.out.println (user.toString ());
        if (user == null || !user.getPassword ().equals ( password )){
            return new Result(ResultCode.MOBILEORPASSWORDERROR);
        }
        Map<String,String> map = new HashMap<> (  );
        map.put ( "companyId",user.getCompanyId () );
        map.put ( "companyName",user.getCompanyName () );
        String token = jwtUtils.createJwt ( user.getId (), user.getUsername (), map );
        return new Result(ResultCode.SUCCESS,token);
    }


    /**
     * 根据token获取用户数据
     */
    @PostMapping("/profile")
    public Result profile( HttpServletRequest request ){
        String authorization = request.getHeader ( "Authorization" );
        if (StringUtils.isEmpty (authorization)){
            throw new CommonException ( ResultCode.UNAUTHENTICATED );
        }
        String token = authorization.replace ( "Bearer ","" );
        Claims claims = jwtUtils.parserJwt ( token );
        String userId= claims.getId ();
        User user = userService.findById ( userId );
        ProfileResult profileResult = new ProfileResult ( user );
        return new Result(ResultCode.SUCCESS,profileResult);
    }


    /**
     * 分配角色
     */
    @RequestMapping(value = "/user/assignRoles", method = RequestMethod.PUT)
    public Result save(@RequestBody Map<String,Object> map) {
        //1.获取被分配的用户id
        String userId = (String) map.get("id");
        //2.获取到角色的id列表
        List<String> roleIds = (List<String>) map.get("roleIds");
        //3.调用service完成角色分配
        userService.assignRoles(userId,roleIds);
        return new Result(ResultCode.SUCCESS);
    }



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
        user.setCompanyId ( companyId );
        UserResult userResult = new UserResult ( user );
        return new Result(ResultCode.SUCCESS,userResult);
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

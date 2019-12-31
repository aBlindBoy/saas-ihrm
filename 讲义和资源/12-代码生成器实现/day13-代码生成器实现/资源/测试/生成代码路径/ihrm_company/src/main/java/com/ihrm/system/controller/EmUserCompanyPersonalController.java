package com.ihrm.system.controller;

import com.ihrm.common.entity.Result;
import com.ihrm.common.entity.ResultCode;
import com.ihrm.common.exception.CommonException;


import com.ihrm.system.service.EmUserCompanyPersonalService;
import com.ihrm.system.pojo.EmUserCompanyPersonal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//解决跨域问题
@CrossOrigin
@RestController
@RequestMapping(value="/emUserCompanyPersonal")
public class EmUserCompanyPersonalController {

    @Autowired
    private EmUserCompanyPersonalService emUserCompanyPersonalService;

    //保存
    @RequestMapping(value="",method = RequestMethod.POST)
    public Result save(@RequestBody EmUserCompanyPersonal emUserCompanyPersonal)  {
        //业务操作
        emUserCompanyPersonalService.add(emUserCompanyPersonal);
        return new Result(ResultCode.SUCCESS);
    }

    //根据id更新
    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    public Result update(@PathVariable(value="id") String id, @RequestBody EmUserCompanyPersonal emUserCompanyPersonal ) {
        //业务操作
        emUserCompanyPersonal.setId(id);
        emUserCompanyPersonalService.update(emUserCompanyPersonal);
        return new Result(ResultCode.SUCCESS);
    }

    //根据id删除
    @RequestMapping(value="/{id}",method = RequestMethod.DELETE)
    public Result delete(@PathVariable(value="id") String id) {
        emUserCompanyPersonalService.deleteById(id);
        return new Result(ResultCode.SUCCESS);
    }

    //根据id查询
    @RequestMapping(value="/{id}",method = RequestMethod.GET)
    public Result findById(@PathVariable(value="id") String id) throws CommonException {
        EmUserCompanyPersonal emUserCompanyPersonal = emUserCompanyPersonalService.findById(id);
        return new Result(ResultCode.SUCCESS,emUserCompanyPersonal);
    }

    //查询全部
    @RequestMapping(value="",method = RequestMethod.GET)
    public Result findAll() {
        List<EmUserCompanyPersonal> list = emUserCompanyPersonalService.findAll();
        Result result = new Result(ResultCode.SUCCESS);
        result.setData(list);
        return result;
    }
}

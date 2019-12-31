package com.ihrm.system.controller;

import com.ihrm.common.entity.Result;
import com.ihrm.common.entity.ResultCode;
import com.ihrm.common.exception.CommonException;


import com.ihrm.system.service.EmUserCompanyJobsService;
import com.ihrm.system.pojo.EmUserCompanyJobs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//解决跨域问题
@CrossOrigin
@RestController
@RequestMapping(value="/emUserCompanyJobs")
public class EmUserCompanyJobsController {

    @Autowired
    private EmUserCompanyJobsService emUserCompanyJobsService;

    //保存
    @RequestMapping(value="",method = RequestMethod.POST)
    public Result save(@RequestBody EmUserCompanyJobs emUserCompanyJobs)  {
        //业务操作
        emUserCompanyJobsService.add(emUserCompanyJobs);
        return new Result(ResultCode.SUCCESS);
    }

    //根据id更新
    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    public Result update(@PathVariable(value="id") String id, @RequestBody EmUserCompanyJobs emUserCompanyJobs ) {
        //业务操作
        emUserCompanyJobs.setId(id);
        emUserCompanyJobsService.update(emUserCompanyJobs);
        return new Result(ResultCode.SUCCESS);
    }

    //根据id删除
    @RequestMapping(value="/{id}",method = RequestMethod.DELETE)
    public Result delete(@PathVariable(value="id") String id) {
        emUserCompanyJobsService.deleteById(id);
        return new Result(ResultCode.SUCCESS);
    }

    //根据id查询
    @RequestMapping(value="/{id}",method = RequestMethod.GET)
    public Result findById(@PathVariable(value="id") String id) throws CommonException {
        EmUserCompanyJobs emUserCompanyJobs = emUserCompanyJobsService.findById(id);
        return new Result(ResultCode.SUCCESS,emUserCompanyJobs);
    }

    //查询全部
    @RequestMapping(value="",method = RequestMethod.GET)
    public Result findAll() {
        List<EmUserCompanyJobs> list = emUserCompanyJobsService.findAll();
        Result result = new Result(ResultCode.SUCCESS);
        result.setData(list);
        return result;
    }
}

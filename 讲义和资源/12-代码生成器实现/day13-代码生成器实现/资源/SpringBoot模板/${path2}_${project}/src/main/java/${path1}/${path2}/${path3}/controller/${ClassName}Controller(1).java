<#assign classNameLower = ClassName ? uncap_first>
package ${pPackage}.controller;

import com.ihrm.common.entity.Result;
import com.ihrm.common.entity.ResultCode;
import com.ihrm.common.exception.CommonException;


import ${pPackage}.service.${ClassName}Service;
import ${pPackage}.pojo.${ClassName};
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//解决跨域问题
@CrossOrigin
@RestController
@RequestMapping(value="/${classNameLower}")
public class ${ClassName}Controller {

    @Autowired
    private ${ClassName}Service ${classNameLower}Service;

    //保存
    @RequestMapping(value="",method = RequestMethod.POST)
    public Result save(@RequestBody ${ClassName} ${classNameLower})  {
        //业务操作
        ${classNameLower}Service.add(${classNameLower});
        return new Result(ResultCode.SUCCESS);
    }

    //根据id更新
    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    public Result update(@PathVariable(value="id") String id, @RequestBody ${ClassName} ${classNameLower} ) {
        //业务操作
        ${classNameLower}.setId(id);
        ${classNameLower}Service.update(${classNameLower});
        return new Result(ResultCode.SUCCESS);
    }

    //根据id删除
    @RequestMapping(value="/{id}",method = RequestMethod.DELETE)
    public Result delete(@PathVariable(value="id") String id) {
        ${classNameLower}Service.deleteById(id);
        return new Result(ResultCode.SUCCESS);
    }

    //根据id查询
    @RequestMapping(value="/{id}",method = RequestMethod.GET)
    public Result findById(@PathVariable(value="id") String id) throws CommonException {
        ${ClassName} ${classNameLower} = ${classNameLower}Service.findById(id);
        return new Result(ResultCode.SUCCESS,${classNameLower});
    }

    //查询全部
    @RequestMapping(value="",method = RequestMethod.GET)
    public Result findAll() {
        List<${ClassName}> list = ${classNameLower}Service.findAll();
        Result result = new Result(ResultCode.SUCCESS);
        result.setData(list);
        return result;
    }
}

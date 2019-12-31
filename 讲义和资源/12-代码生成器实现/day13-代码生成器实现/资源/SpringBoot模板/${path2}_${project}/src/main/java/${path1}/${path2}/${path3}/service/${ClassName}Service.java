<#assign classNameLower = ClassName ? uncap_first>
package ${pPackage}.service;


import com.ihrm.common.utils.IdWorker;
import ${pPackage}.dao.${ClassName}Dao;
import ${pPackage}.pojo.${ClassName};
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ${ClassName}Service {

    @Autowired
    private ${ClassName}Dao ${classNameLower}Dao;

    @Autowired
    private IdWorker idWorker;

    /**
     * 保存
     */
    public void add(${ClassName} ${classNameLower}) {
        //基本属性的设置
        String id = idWorker.nextId()+"";
        ${classNameLower}.setId(id);
        ${classNameLower}Dao.save(${classNameLower});
    }

    /**
     * 更新
     */
    public void update(${ClassName} ${classNameLower}) {
        ${classNameLower}Dao.save(${classNameLower});
    }

    /**
     * 删除
     */
    public void deleteById(String id) {
        ${classNameLower}Dao.deleteById(id);
    }

    /**
     * 根据id查询
     */
    public ${ClassName} findById(String id) {
        return ${classNameLower}Dao.findById(id).get();
    }

    /**
     * 查询列表
     */
    public List<${ClassName}> findAll() {
        return ${classNameLower}Dao.findAll();
    }
}

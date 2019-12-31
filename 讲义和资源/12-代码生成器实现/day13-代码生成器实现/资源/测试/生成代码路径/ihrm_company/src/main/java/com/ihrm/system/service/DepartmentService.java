package com.ihrm.system.service;


import com.ihrm.common.utils.IdWorker;
import com.ihrm.system.dao.DepartmentDao;
import com.ihrm.system.pojo.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentDao departmentDao;

    @Autowired
    private IdWorker idWorker;

    /**
     * 保存
     */
    public void add(Department department) {
        //基本属性的设置
        String id = idWorker.nextId()+"";
        department.setId(id);
        departmentDao.save(department);
    }

    /**
     * 更新
     */
    public void update(Department department) {
        departmentDao.save(department);
    }

    /**
     * 删除
     */
    public void deleteById(String id) {
        departmentDao.deleteById(id);
    }

    /**
     * 根据id查询
     */
    public Department findById(String id) {
        return departmentDao.findById(id).get();
    }

    /**
     * 查询列表
     */
    public List<Department> findAll() {
        return departmentDao.findAll();
    }
}

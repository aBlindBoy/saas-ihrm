package com.ihrm.system.service;


import com.ihrm.common.utils.IdWorker;
import com.ihrm.system.dao.RoleDao;
import com.ihrm.system.pojo.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RoleService {

    @Autowired
    private RoleDao roleDao;

    @Autowired
    private IdWorker idWorker;

    /**
     * 保存
     */
    public void add(Role role) {
        //基本属性的设置
        String id = idWorker.nextId()+"";
        role.setId(id);
        roleDao.save(role);
    }

    /**
     * 更新
     */
    public void update(Role role) {
        roleDao.save(role);
    }

    /**
     * 删除
     */
    public void deleteById(String id) {
        roleDao.deleteById(id);
    }

    /**
     * 根据id查询
     */
    public Role findById(String id) {
        return roleDao.findById(id).get();
    }

    /**
     * 查询列表
     */
    public List<Role> findAll() {
        return roleDao.findAll();
    }
}

package com.ihrm.system.service;


import com.ihrm.common.utils.IdWorker;
import com.ihrm.system.dao.RolePermissionDao;
import com.ihrm.system.pojo.RolePermission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RolePermissionService {

    @Autowired
    private RolePermissionDao rolePermissionDao;

    @Autowired
    private IdWorker idWorker;

    /**
     * 保存
     */
    public void add(RolePermission rolePermission) {
        //基本属性的设置
        String id = idWorker.nextId()+"";
        rolePermission.setId(id);
        rolePermissionDao.save(rolePermission);
    }

    /**
     * 更新
     */
    public void update(RolePermission rolePermission) {
        rolePermissionDao.save(rolePermission);
    }

    /**
     * 删除
     */
    public void deleteById(String id) {
        rolePermissionDao.deleteById(id);
    }

    /**
     * 根据id查询
     */
    public RolePermission findById(String id) {
        return rolePermissionDao.findById(id).get();
    }

    /**
     * 查询列表
     */
    public List<RolePermission> findAll() {
        return rolePermissionDao.findAll();
    }
}

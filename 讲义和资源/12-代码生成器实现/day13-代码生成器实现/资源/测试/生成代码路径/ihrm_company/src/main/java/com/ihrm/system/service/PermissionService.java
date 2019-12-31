package com.ihrm.system.service;


import com.ihrm.common.utils.IdWorker;
import com.ihrm.system.dao.PermissionDao;
import com.ihrm.system.pojo.Permission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PermissionService {

    @Autowired
    private PermissionDao permissionDao;

    @Autowired
    private IdWorker idWorker;

    /**
     * 保存
     */
    public void add(Permission permission) {
        //基本属性的设置
        String id = idWorker.nextId()+"";
        permission.setId(id);
        permissionDao.save(permission);
    }

    /**
     * 更新
     */
    public void update(Permission permission) {
        permissionDao.save(permission);
    }

    /**
     * 删除
     */
    public void deleteById(String id) {
        permissionDao.deleteById(id);
    }

    /**
     * 根据id查询
     */
    public Permission findById(String id) {
        return permissionDao.findById(id).get();
    }

    /**
     * 查询列表
     */
    public List<Permission> findAll() {
        return permissionDao.findAll();
    }
}

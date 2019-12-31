package com.ihrm.system.service;


import com.ihrm.common.utils.IdWorker;
import com.ihrm.system.dao.PermissionMenuDao;
import com.ihrm.system.pojo.PermissionMenu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PermissionMenuService {

    @Autowired
    private PermissionMenuDao permissionMenuDao;

    @Autowired
    private IdWorker idWorker;

    /**
     * 保存
     */
    public void add(PermissionMenu permissionMenu) {
        //基本属性的设置
        String id = idWorker.nextId()+"";
        permissionMenu.setId(id);
        permissionMenuDao.save(permissionMenu);
    }

    /**
     * 更新
     */
    public void update(PermissionMenu permissionMenu) {
        permissionMenuDao.save(permissionMenu);
    }

    /**
     * 删除
     */
    public void deleteById(String id) {
        permissionMenuDao.deleteById(id);
    }

    /**
     * 根据id查询
     */
    public PermissionMenu findById(String id) {
        return permissionMenuDao.findById(id).get();
    }

    /**
     * 查询列表
     */
    public List<PermissionMenu> findAll() {
        return permissionMenuDao.findAll();
    }
}

package com.ihrm.system.service;


import com.ihrm.common.utils.IdWorker;
import com.ihrm.system.dao.PermissionPointDao;
import com.ihrm.system.pojo.PermissionPoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PermissionPointService {

    @Autowired
    private PermissionPointDao permissionPointDao;

    @Autowired
    private IdWorker idWorker;

    /**
     * 保存
     */
    public void add(PermissionPoint permissionPoint) {
        //基本属性的设置
        String id = idWorker.nextId()+"";
        permissionPoint.setId(id);
        permissionPointDao.save(permissionPoint);
    }

    /**
     * 更新
     */
    public void update(PermissionPoint permissionPoint) {
        permissionPointDao.save(permissionPoint);
    }

    /**
     * 删除
     */
    public void deleteById(String id) {
        permissionPointDao.deleteById(id);
    }

    /**
     * 根据id查询
     */
    public PermissionPoint findById(String id) {
        return permissionPointDao.findById(id).get();
    }

    /**
     * 查询列表
     */
    public List<PermissionPoint> findAll() {
        return permissionPointDao.findAll();
    }
}

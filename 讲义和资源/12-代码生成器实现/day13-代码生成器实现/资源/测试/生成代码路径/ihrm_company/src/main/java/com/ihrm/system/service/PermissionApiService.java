package com.ihrm.system.service;


import com.ihrm.common.utils.IdWorker;
import com.ihrm.system.dao.PermissionApiDao;
import com.ihrm.system.pojo.PermissionApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PermissionApiService {

    @Autowired
    private PermissionApiDao permissionApiDao;

    @Autowired
    private IdWorker idWorker;

    /**
     * 保存
     */
    public void add(PermissionApi permissionApi) {
        //基本属性的设置
        String id = idWorker.nextId()+"";
        permissionApi.setId(id);
        permissionApiDao.save(permissionApi);
    }

    /**
     * 更新
     */
    public void update(PermissionApi permissionApi) {
        permissionApiDao.save(permissionApi);
    }

    /**
     * 删除
     */
    public void deleteById(String id) {
        permissionApiDao.deleteById(id);
    }

    /**
     * 根据id查询
     */
    public PermissionApi findById(String id) {
        return permissionApiDao.findById(id).get();
    }

    /**
     * 查询列表
     */
    public List<PermissionApi> findAll() {
        return permissionApiDao.findAll();
    }
}

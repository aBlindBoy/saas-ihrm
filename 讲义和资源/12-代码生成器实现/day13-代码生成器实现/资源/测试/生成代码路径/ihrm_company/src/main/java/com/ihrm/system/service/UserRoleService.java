package com.ihrm.system.service;


import com.ihrm.common.utils.IdWorker;
import com.ihrm.system.dao.UserRoleDao;
import com.ihrm.system.pojo.UserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserRoleService {

    @Autowired
    private UserRoleDao userRoleDao;

    @Autowired
    private IdWorker idWorker;

    /**
     * 保存
     */
    public void add(UserRole userRole) {
        //基本属性的设置
        String id = idWorker.nextId()+"";
        userRole.setId(id);
        userRoleDao.save(userRole);
    }

    /**
     * 更新
     */
    public void update(UserRole userRole) {
        userRoleDao.save(userRole);
    }

    /**
     * 删除
     */
    public void deleteById(String id) {
        userRoleDao.deleteById(id);
    }

    /**
     * 根据id查询
     */
    public UserRole findById(String id) {
        return userRoleDao.findById(id).get();
    }

    /**
     * 查询列表
     */
    public List<UserRole> findAll() {
        return userRoleDao.findAll();
    }
}

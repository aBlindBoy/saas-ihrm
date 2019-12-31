package com.ihrm.system.service;


import com.ihrm.common.utils.IdWorker;
import com.ihrm.system.dao.EmUserCompanyPersonalDao;
import com.ihrm.system.pojo.EmUserCompanyPersonal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmUserCompanyPersonalService {

    @Autowired
    private EmUserCompanyPersonalDao emUserCompanyPersonalDao;

    @Autowired
    private IdWorker idWorker;

    /**
     * 保存
     */
    public void add(EmUserCompanyPersonal emUserCompanyPersonal) {
        //基本属性的设置
        String id = idWorker.nextId()+"";
        emUserCompanyPersonal.setId(id);
        emUserCompanyPersonalDao.save(emUserCompanyPersonal);
    }

    /**
     * 更新
     */
    public void update(EmUserCompanyPersonal emUserCompanyPersonal) {
        emUserCompanyPersonalDao.save(emUserCompanyPersonal);
    }

    /**
     * 删除
     */
    public void deleteById(String id) {
        emUserCompanyPersonalDao.deleteById(id);
    }

    /**
     * 根据id查询
     */
    public EmUserCompanyPersonal findById(String id) {
        return emUserCompanyPersonalDao.findById(id).get();
    }

    /**
     * 查询列表
     */
    public List<EmUserCompanyPersonal> findAll() {
        return emUserCompanyPersonalDao.findAll();
    }
}

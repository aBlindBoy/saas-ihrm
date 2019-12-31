package com.ihrm.system.service;


import com.ihrm.common.utils.IdWorker;
import com.ihrm.system.dao.EmUserCompanyDao;
import com.ihrm.system.pojo.EmUserCompany;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmUserCompanyService {

    @Autowired
    private EmUserCompanyDao emUserCompanyDao;

    @Autowired
    private IdWorker idWorker;

    /**
     * 保存
     */
    public void add(EmUserCompany emUserCompany) {
        //基本属性的设置
        String id = idWorker.nextId()+"";
        emUserCompany.setId(id);
        emUserCompanyDao.save(emUserCompany);
    }

    /**
     * 更新
     */
    public void update(EmUserCompany emUserCompany) {
        emUserCompanyDao.save(emUserCompany);
    }

    /**
     * 删除
     */
    public void deleteById(String id) {
        emUserCompanyDao.deleteById(id);
    }

    /**
     * 根据id查询
     */
    public EmUserCompany findById(String id) {
        return emUserCompanyDao.findById(id).get();
    }

    /**
     * 查询列表
     */
    public List<EmUserCompany> findAll() {
        return emUserCompanyDao.findAll();
    }
}

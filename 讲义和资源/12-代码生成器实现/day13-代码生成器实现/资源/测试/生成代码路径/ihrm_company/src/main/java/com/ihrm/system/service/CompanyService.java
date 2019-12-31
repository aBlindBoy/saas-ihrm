package com.ihrm.system.service;


import com.ihrm.common.utils.IdWorker;
import com.ihrm.system.dao.CompanyDao;
import com.ihrm.system.pojo.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CompanyService {

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private IdWorker idWorker;

    /**
     * 保存
     */
    public void add(Company company) {
        //基本属性的设置
        String id = idWorker.nextId()+"";
        company.setId(id);
        companyDao.save(company);
    }

    /**
     * 更新
     */
    public void update(Company company) {
        companyDao.save(company);
    }

    /**
     * 删除
     */
    public void deleteById(String id) {
        companyDao.deleteById(id);
    }

    /**
     * 根据id查询
     */
    public Company findById(String id) {
        return companyDao.findById(id).get();
    }

    /**
     * 查询列表
     */
    public List<Company> findAll() {
        return companyDao.findAll();
    }
}

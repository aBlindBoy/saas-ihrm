package com.ihrm.system.service;


import com.ihrm.common.utils.IdWorker;
import com.ihrm.system.dao.EmUserCompanyJobsDao;
import com.ihrm.system.pojo.EmUserCompanyJobs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmUserCompanyJobsService {

    @Autowired
    private EmUserCompanyJobsDao emUserCompanyJobsDao;

    @Autowired
    private IdWorker idWorker;

    /**
     * 保存
     */
    public void add(EmUserCompanyJobs emUserCompanyJobs) {
        //基本属性的设置
        String id = idWorker.nextId()+"";
        emUserCompanyJobs.setId(id);
        emUserCompanyJobsDao.save(emUserCompanyJobs);
    }

    /**
     * 更新
     */
    public void update(EmUserCompanyJobs emUserCompanyJobs) {
        emUserCompanyJobsDao.save(emUserCompanyJobs);
    }

    /**
     * 删除
     */
    public void deleteById(String id) {
        emUserCompanyJobsDao.deleteById(id);
    }

    /**
     * 根据id查询
     */
    public EmUserCompanyJobs findById(String id) {
        return emUserCompanyJobsDao.findById(id).get();
    }

    /**
     * 查询列表
     */
    public List<EmUserCompanyJobs> findAll() {
        return emUserCompanyJobsDao.findAll();
    }
}

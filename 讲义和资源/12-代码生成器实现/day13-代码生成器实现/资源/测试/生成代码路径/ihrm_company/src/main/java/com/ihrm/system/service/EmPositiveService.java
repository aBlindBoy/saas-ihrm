package com.ihrm.system.service;


import com.ihrm.common.utils.IdWorker;
import com.ihrm.system.dao.EmPositiveDao;
import com.ihrm.system.pojo.EmPositive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmPositiveService {

    @Autowired
    private EmPositiveDao emPositiveDao;

    @Autowired
    private IdWorker idWorker;

    /**
     * 保存
     */
    public void add(EmPositive emPositive) {
        //基本属性的设置
        String id = idWorker.nextId()+"";
        emPositive.setId(id);
        emPositiveDao.save(emPositive);
    }

    /**
     * 更新
     */
    public void update(EmPositive emPositive) {
        emPositiveDao.save(emPositive);
    }

    /**
     * 删除
     */
    public void deleteById(String id) {
        emPositiveDao.deleteById(id);
    }

    /**
     * 根据id查询
     */
    public EmPositive findById(String id) {
        return emPositiveDao.findById(id).get();
    }

    /**
     * 查询列表
     */
    public List<EmPositive> findAll() {
        return emPositiveDao.findAll();
    }
}

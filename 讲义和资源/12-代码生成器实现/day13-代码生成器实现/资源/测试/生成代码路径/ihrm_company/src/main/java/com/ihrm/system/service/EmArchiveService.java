package com.ihrm.system.service;


import com.ihrm.common.utils.IdWorker;
import com.ihrm.system.dao.EmArchiveDao;
import com.ihrm.system.pojo.EmArchive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmArchiveService {

    @Autowired
    private EmArchiveDao emArchiveDao;

    @Autowired
    private IdWorker idWorker;

    /**
     * 保存
     */
    public void add(EmArchive emArchive) {
        //基本属性的设置
        String id = idWorker.nextId()+"";
        emArchive.setId(id);
        emArchiveDao.save(emArchive);
    }

    /**
     * 更新
     */
    public void update(EmArchive emArchive) {
        emArchiveDao.save(emArchive);
    }

    /**
     * 删除
     */
    public void deleteById(String id) {
        emArchiveDao.deleteById(id);
    }

    /**
     * 根据id查询
     */
    public EmArchive findById(String id) {
        return emArchiveDao.findById(id).get();
    }

    /**
     * 查询列表
     */
    public List<EmArchive> findAll() {
        return emArchiveDao.findAll();
    }
}

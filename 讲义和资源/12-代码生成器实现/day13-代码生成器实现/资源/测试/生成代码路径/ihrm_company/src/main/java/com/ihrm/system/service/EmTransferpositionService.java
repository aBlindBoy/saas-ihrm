package com.ihrm.system.service;


import com.ihrm.common.utils.IdWorker;
import com.ihrm.system.dao.EmTransferpositionDao;
import com.ihrm.system.pojo.EmTransferposition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmTransferpositionService {

    @Autowired
    private EmTransferpositionDao emTransferpositionDao;

    @Autowired
    private IdWorker idWorker;

    /**
     * 保存
     */
    public void add(EmTransferposition emTransferposition) {
        //基本属性的设置
        String id = idWorker.nextId()+"";
        emTransferposition.setId(id);
        emTransferpositionDao.save(emTransferposition);
    }

    /**
     * 更新
     */
    public void update(EmTransferposition emTransferposition) {
        emTransferpositionDao.save(emTransferposition);
    }

    /**
     * 删除
     */
    public void deleteById(String id) {
        emTransferpositionDao.deleteById(id);
    }

    /**
     * 根据id查询
     */
    public EmTransferposition findById(String id) {
        return emTransferpositionDao.findById(id).get();
    }

    /**
     * 查询列表
     */
    public List<EmTransferposition> findAll() {
        return emTransferpositionDao.findAll();
    }
}

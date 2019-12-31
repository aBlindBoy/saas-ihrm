package com.ihrm.system.service;


import com.ihrm.common.utils.IdWorker;
import com.ihrm.system.dao.TransactionRecordDao;
import com.ihrm.system.pojo.TransactionRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TransactionRecordService {

    @Autowired
    private TransactionRecordDao transactionRecordDao;

    @Autowired
    private IdWorker idWorker;

    /**
     * 保存
     */
    public void add(TransactionRecord transactionRecord) {
        //基本属性的设置
        String id = idWorker.nextId()+"";
        transactionRecord.setId(id);
        transactionRecordDao.save(transactionRecord);
    }

    /**
     * 更新
     */
    public void update(TransactionRecord transactionRecord) {
        transactionRecordDao.save(transactionRecord);
    }

    /**
     * 删除
     */
    public void deleteById(String id) {
        transactionRecordDao.deleteById(id);
    }

    /**
     * 根据id查询
     */
    public TransactionRecord findById(String id) {
        return transactionRecordDao.findById(id).get();
    }

    /**
     * 查询列表
     */
    public List<TransactionRecord> findAll() {
        return transactionRecordDao.findAll();
    }
}

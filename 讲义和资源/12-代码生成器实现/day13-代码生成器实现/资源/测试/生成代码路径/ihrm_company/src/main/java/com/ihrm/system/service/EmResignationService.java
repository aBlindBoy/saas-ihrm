package com.ihrm.system.service;


import com.ihrm.common.utils.IdWorker;
import com.ihrm.system.dao.EmResignationDao;
import com.ihrm.system.pojo.EmResignation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmResignationService {

    @Autowired
    private EmResignationDao emResignationDao;

    @Autowired
    private IdWorker idWorker;

    /**
     * 保存
     */
    public void add(EmResignation emResignation) {
        //基本属性的设置
        String id = idWorker.nextId()+"";
        emResignation.setId(id);
        emResignationDao.save(emResignation);
    }

    /**
     * 更新
     */
    public void update(EmResignation emResignation) {
        emResignationDao.save(emResignation);
    }

    /**
     * 删除
     */
    public void deleteById(String id) {
        emResignationDao.deleteById(id);
    }

    /**
     * 根据id查询
     */
    public EmResignation findById(String id) {
        return emResignationDao.findById(id).get();
    }

    /**
     * 查询列表
     */
    public List<EmResignation> findAll() {
        return emResignationDao.findAll();
    }
}

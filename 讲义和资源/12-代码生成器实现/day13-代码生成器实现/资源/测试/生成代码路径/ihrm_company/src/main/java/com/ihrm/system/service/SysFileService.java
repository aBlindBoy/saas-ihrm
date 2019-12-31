package com.ihrm.system.service;


import com.ihrm.common.utils.IdWorker;
import com.ihrm.system.dao.SysFileDao;
import com.ihrm.system.pojo.SysFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SysFileService {

    @Autowired
    private SysFileDao sysFileDao;

    @Autowired
    private IdWorker idWorker;

    /**
     * 保存
     */
    public void add(SysFile sysFile) {
        //基本属性的设置
        String id = idWorker.nextId()+"";
        sysFile.setId(id);
        sysFileDao.save(sysFile);
    }

    /**
     * 更新
     */
    public void update(SysFile sysFile) {
        sysFileDao.save(sysFile);
    }

    /**
     * 删除
     */
    public void deleteById(String id) {
        sysFileDao.deleteById(id);
    }

    /**
     * 根据id查询
     */
    public SysFile findById(String id) {
        return sysFileDao.findById(id).get();
    }

    /**
     * 查询列表
     */
    public List<SysFile> findAll() {
        return sysFileDao.findAll();
    }
}

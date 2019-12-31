package com.ihrm.system.service;


import com.ihrm.common.utils.IdWorker;
import com.ihrm.system.dao.SysSettingsDao;
import com.ihrm.system.pojo.SysSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SysSettingsService {

    @Autowired
    private SysSettingsDao sysSettingsDao;

    @Autowired
    private IdWorker idWorker;

    /**
     * 保存
     */
    public void add(SysSettings sysSettings) {
        //基本属性的设置
        String id = idWorker.nextId()+"";
        sysSettings.setId(id);
        sysSettingsDao.save(sysSettings);
    }

    /**
     * 更新
     */
    public void update(SysSettings sysSettings) {
        sysSettingsDao.save(sysSettings);
    }

    /**
     * 删除
     */
    public void deleteById(String id) {
        sysSettingsDao.deleteById(id);
    }

    /**
     * 根据id查询
     */
    public SysSettings findById(String id) {
        return sysSettingsDao.findById(id).get();
    }

    /**
     * 查询列表
     */
    public List<SysSettings> findAll() {
        return sysSettingsDao.findAll();
    }
}

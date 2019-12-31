package com.ihrm.system.dao;

import com.ihrm.system.pojo.SysSettings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface SysSettingsDao extends JpaRepository<SysSettings,String> ,JpaSpecificationExecutor<SysSettings> {
}

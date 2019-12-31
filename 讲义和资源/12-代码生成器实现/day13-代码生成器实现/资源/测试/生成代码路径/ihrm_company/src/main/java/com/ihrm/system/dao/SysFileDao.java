package com.ihrm.system.dao;

import com.ihrm.system.pojo.SysFile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface SysFileDao extends JpaRepository<SysFile,String> ,JpaSpecificationExecutor<SysFile> {
}

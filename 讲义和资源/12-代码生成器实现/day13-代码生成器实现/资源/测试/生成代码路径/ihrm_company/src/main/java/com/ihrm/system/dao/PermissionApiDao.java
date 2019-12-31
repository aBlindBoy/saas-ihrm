package com.ihrm.system.dao;

import com.ihrm.system.pojo.PermissionApi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface PermissionApiDao extends JpaRepository<PermissionApi,String> ,JpaSpecificationExecutor<PermissionApi> {
}

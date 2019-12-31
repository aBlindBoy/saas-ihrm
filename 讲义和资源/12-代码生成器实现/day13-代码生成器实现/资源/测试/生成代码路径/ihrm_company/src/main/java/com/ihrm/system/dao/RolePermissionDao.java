package com.ihrm.system.dao;

import com.ihrm.system.pojo.RolePermission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface RolePermissionDao extends JpaRepository<RolePermission,String> ,JpaSpecificationExecutor<RolePermission> {
}

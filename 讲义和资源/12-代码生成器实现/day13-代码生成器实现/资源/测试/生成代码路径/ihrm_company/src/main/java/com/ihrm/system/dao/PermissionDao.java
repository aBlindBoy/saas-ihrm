package com.ihrm.system.dao;

import com.ihrm.system.pojo.Permission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface PermissionDao extends JpaRepository<Permission,String> ,JpaSpecificationExecutor<Permission> {
}

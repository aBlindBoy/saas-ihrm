package com.ihrm.system.dao;

import com.ihrm.system.pojo.PermissionMenu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface PermissionMenuDao extends JpaRepository<PermissionMenu,String> ,JpaSpecificationExecutor<PermissionMenu> {
}

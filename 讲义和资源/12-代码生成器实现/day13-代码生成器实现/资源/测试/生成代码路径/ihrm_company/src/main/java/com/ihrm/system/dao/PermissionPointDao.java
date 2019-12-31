package com.ihrm.system.dao;

import com.ihrm.system.pojo.PermissionPoint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface PermissionPointDao extends JpaRepository<PermissionPoint,String> ,JpaSpecificationExecutor<PermissionPoint> {
}

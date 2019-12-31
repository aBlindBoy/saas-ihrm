package com.ihrm.system.dao;

import com.ihrm.system.pojo.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface UserRoleDao extends JpaRepository<UserRole,String> ,JpaSpecificationExecutor<UserRole> {
}

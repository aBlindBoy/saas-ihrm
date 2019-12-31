package com.ihrm.system.dao;

import com.ihrm.system.pojo.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface DepartmentDao extends JpaRepository<Department,String> ,JpaSpecificationExecutor<Department> {
}

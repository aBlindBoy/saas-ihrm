package com.ihrm.system.dao;

import com.ihrm.system.pojo.EmUserCompany;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface EmUserCompanyDao extends JpaRepository<EmUserCompany,String> ,JpaSpecificationExecutor<EmUserCompany> {
}

package com.ihrm.system.dao;

import com.ihrm.system.pojo.EmUserCompanyPersonal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface EmUserCompanyPersonalDao extends JpaRepository<EmUserCompanyPersonal,String> ,JpaSpecificationExecutor<EmUserCompanyPersonal> {
}

package com.ihrm.system.dao;

import com.ihrm.system.pojo.EmUserCompanyJobs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface EmUserCompanyJobsDao extends JpaRepository<EmUserCompanyJobs,String> ,JpaSpecificationExecutor<EmUserCompanyJobs> {
}

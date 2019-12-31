package com.ihrm.system.dao;

import com.ihrm.system.pojo.EmPositive;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface EmPositiveDao extends JpaRepository<EmPositive,String> ,JpaSpecificationExecutor<EmPositive> {
}

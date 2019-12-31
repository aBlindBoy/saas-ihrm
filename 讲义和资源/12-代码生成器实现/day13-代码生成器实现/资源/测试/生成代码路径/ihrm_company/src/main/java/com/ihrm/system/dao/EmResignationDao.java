package com.ihrm.system.dao;

import com.ihrm.system.pojo.EmResignation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface EmResignationDao extends JpaRepository<EmResignation,String> ,JpaSpecificationExecutor<EmResignation> {
}

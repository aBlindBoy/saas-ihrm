package com.ihrm.system.dao;

import com.ihrm.system.pojo.EmTransferposition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface EmTransferpositionDao extends JpaRepository<EmTransferposition,String> ,JpaSpecificationExecutor<EmTransferposition> {
}

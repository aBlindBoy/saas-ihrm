package com.ihrm.system.dao;

import com.ihrm.system.pojo.TransactionRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TransactionRecordDao extends JpaRepository<TransactionRecord,String> ,JpaSpecificationExecutor<TransactionRecord> {
}

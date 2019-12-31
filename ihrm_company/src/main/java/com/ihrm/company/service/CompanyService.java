package com.ihrm.company.service;

import com.ihrm.common.utils.IdWorker;
import com.ihrm.company.dao.CompanyDao;
import com.ihrm.domain.company.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class CompanyService {


    @Autowired
    private CompanyDao companyDao;


    public Company add( Company company ) {
        company.setCreateTime ( new Date () );
        company.setState ( 1 );    //启用
        company.setManagerId ( "1" );
        company.setAuditState ( "0" ); //待审核
        company.setBalance ( 0d );
        return companyDao.save ( company );
    }

    public Company update( Company company ) {
        return companyDao.save ( company );
    }

    public Company findById( String id ) {
        return companyDao.findById ( id ).get ();
    }

    public void deleteById( String id ) {
        companyDao.deleteById ( id );
    }

    public List<Company> findAll() {
        return companyDao.findAll ();
    }


}

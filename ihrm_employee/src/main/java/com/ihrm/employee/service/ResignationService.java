package com.ihrm.employee.service;

import com.ihrm.domain.employee.EmployeeResignation;
import com.ihrm.employee.dao.EmployeeResignationDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created with IDEA
 * Author:xzengsf
 * Date:2018/10/20 14:23
 * Description:
 */
@Service
public class ResignationService {
    @Autowired
    EmployeeResignationDao resignationDao;

    public void save(EmployeeResignation resignation) {
        resignation.setCreateTime(new Date());
        resignationDao.save(resignation);
    }

    public EmployeeResignation findById(String userId) {
        return resignationDao.findByUserId(userId);
    }
}

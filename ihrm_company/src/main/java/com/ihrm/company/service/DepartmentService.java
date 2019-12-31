package com.ihrm.company.service;

import com.ihrm.common.service.BaseService;
import com.ihrm.common.utils.IdWorker;
import com.ihrm.company.dao.DepartmentDao;
import com.ihrm.domain.company.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService extends BaseService<Department> {

    @Autowired
    private DepartmentDao departmentDao;

    @Autowired
    private IdWorker idWorker;

    public void add( Department department ){
        String id = idWorker.nextId ()+ "";
        department.setId ( id );
        Department save = departmentDao.save ( department );
    }


    public void delete( String id ){
        departmentDao.deleteById ( id );
    }


    public void update( Department department ){
        Department save = departmentDao.save ( department );
    }

    public Department findById( String id ){
        Department department = departmentDao.findById ( id ).get ();
        return department;
    }

    public List<Department> findAll( String companyId){
        List<Department> departments = departmentDao.findAll (getSpec ( companyId ));
        return departments;
    }

}

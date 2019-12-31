package com.ihrm.company.controller;

import com.ihrm.common.entity.Result;
import com.ihrm.common.entity.ResultCode;
import com.ihrm.common.exception.CommonException;
import com.ihrm.company.dao.CompanyDao;
import com.ihrm.company.service.CompanyService;
import com.ihrm.domain.company.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/company")
public class CompanyController {


    @Autowired
    private CompanyService companyService;


    @PostMapping("")
    public ResponseEntity<Result> add( @RequestBody Company company ){
        company.setId ( "1" );
        companyService.add ( company );
        return ResponseEntity.ok ( new Result ( ResultCode.SUCCESS ) );
    }


    @PutMapping("/{id}")
    public ResponseEntity<Result> update( @PathVariable("id") String id,@RequestBody Company company ){
        company.setId ( id );
        companyService.update ( company );
        return ResponseEntity.ok ( new Result ( ResultCode.SUCCESS ) );
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Result> delete( @PathVariable("id") String id){
        companyService.deleteById ( id );

        return ResponseEntity.ok ( new Result ( ResultCode.SUCCESS ) );
    }

    @GetMapping("/{id}")
    public ResponseEntity<Result> findById( @PathVariable("id") String id){
        System.out.println (id);
        Company company = companyService.findById ( id );
        return ResponseEntity.ok ( new Result ( ResultCode.SUCCESS ,company)  );
    }

    @GetMapping("")
    public ResponseEntity<Result> findAll( ){
        List<Company> companies = companyService.findAll ();
        return ResponseEntity.ok ( new Result ( ResultCode.SUCCESS ,companies)  );
    }


}

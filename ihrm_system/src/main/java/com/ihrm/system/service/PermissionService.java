package com.ihrm.system.service;

import com.ihrm.common.entity.ResultCode;
import com.ihrm.common.exception.CommonException;
import com.ihrm.common.service.BaseService;
import com.ihrm.common.utils.BeanMapUtils;
import com.ihrm.common.utils.IdWorker;
import com.ihrm.common.utils.PermissionConstants;
import com.ihrm.domain.system.*;
import com.ihrm.system.dao.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.*;

@Service
@Transactional
public class PermissionService {


    @Autowired
    private PermissionDao permissionDao;

    @Autowired
    private PermissionMenuDao permissionMenuDao;

    @Autowired
    private PermissionPointDao permissionPointDao;

    @Autowired
    private PermissionApiDao permissionApiDao;


    @Autowired
    private IdWorker idWorker;

    public void add( Map<String, Object> map ) throws Exception {
        String id = idWorker.nextId () + "";
        Permission permission = BeanMapUtils.mapToBean ( map, Permission.class );
        permission.setId ( id );

        Integer type = permission.getType ();
        switch (type) {
            case PermissionConstants.PY_MENU:
                PermissionMenu permissionMenu = BeanMapUtils.mapToBean ( map, PermissionMenu.class );
                permissionMenu.setId ( id );
                permissionMenuDao.save ( permissionMenu );
                break;
            case PermissionConstants.PY_API:
                PermissionApi permissionApi = BeanMapUtils.mapToBean ( map, PermissionApi.class );
                permissionApi.setId ( id );
                permissionApiDao.save ( permissionApi );
                break;
            case PermissionConstants.PY_POINT:
                PermissionPoint permissionPoint = BeanMapUtils.mapToBean ( map, PermissionPoint.class );
                permissionPoint.setId ( id );
                permissionPointDao.save ( permissionPoint );
                break;
            default:
                throw new CommonException ( ResultCode.FAIL );
        }

        permissionDao.save ( permission );

    }


    /**
     * 删除权限和对应的权限资源
     * @param id
     */
    public void delete( String id ) {
        Permission permission = permissionDao.findById (id ).get ();

        Integer type = permission.getType ();
        switch (type) {
            case PermissionConstants.PY_MENU:
                permissionMenuDao.deleteById ( id );
                break;
            case PermissionConstants.PY_API:
                permissionApiDao.deleteById ( id );
                break;
            case PermissionConstants.PY_POINT:
                permissionPointDao.deleteById ( id );
                break;
            default:
                throw new CommonException ( ResultCode.FAIL );
        }
        permissionDao.deleteById ( id );
    }


    public void update( Map<String, Object> map ) throws Exception {
        Permission perm = BeanMapUtils.mapToBean ( map, Permission.class );//       Permission permission = permissionDao.findById ( perm.getId () ).get ();
//        permission.setId ( perm.getId () );
//        permission.setCode ( perm.getCode () );
//        permission.setDescription ( perm.getDescription () );
//        permission.setEnVisible ( perm.getEnVisible () );
//        permission.setType ( perm.getType () );
        Integer type = perm.getType ();
        switch (type) {
            case PermissionConstants.PY_MENU:
                PermissionMenu permissionMenu = BeanMapUtils.mapToBean ( map, PermissionMenu.class );
                permissionMenu.setId ( perm.getId () );
                permissionMenuDao.save ( permissionMenu );
                break;
            case PermissionConstants.PY_API:
                PermissionApi permissionApi = BeanMapUtils.mapToBean ( map, PermissionApi.class );
                permissionApi.setId ( perm.getId () );
                permissionApiDao.save ( permissionApi );
                break;
            case PermissionConstants.PY_POINT:
                PermissionPoint permissionPoint = BeanMapUtils.mapToBean ( map, PermissionPoint.class );
                permissionPoint.setId ( perm.getId () );
                permissionPointDao.save ( permissionPoint );
                break;
            default:
                throw new CommonException ( ResultCode.FAIL );
        }

        Permission save = permissionDao.save ( perm );
    }

    public Map findById( String id ) {
        Permission permission = permissionDao.findById ( id ).get ();
        Object obj = null;
        Integer type = permission.getType ();
        if (type == PermissionConstants.PY_MENU){
            obj=permissionMenuDao.findById ( id );
        }else if (type == PermissionConstants.PY_POINT){
            obj=permissionPointDao.findById ( id );
        }else if (type == PermissionConstants.PY_API){
            obj=permissionApiDao.findById ( id );
        }else{
            throw new CommonException ( ResultCode.FAIL );
        }
        Map<String,Object> map = BeanMapUtils.beanToMap ( obj );
        map.put ( "id",permission.getId ());
        map.put ( "name",permission.getName () );
        map.put ( "type",permission.getType () );

        map.put ( "code",permission.getCode () );
        map.put ( "description",permission.getDescription () );

        map.put ( "pid",permission.getPid () );
        map.put ( "enVisible",permission.getEnVisible () );
        return map;
    }

    /**
     * 条件查询
     *
     * @param map 查询条件
     * @return
     */
    public List<Permission> findAll( Map<String, Object> map ) {

        Specification<Permission> spec = new Specification<Permission> () {
            @Override
            public Predicate toPredicate( Root<Permission> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder ) {
                List<Predicate> list = new ArrayList<> ();
                //动态添加查询条件
                if (!StringUtils.isEmpty ( map.get ( "pid" ) )) {
                    list.add ( criteriaBuilder.equal ( root.get ( "pid" ).as ( String.class ), (String) map.get ( "pid" ) ) );
                }
                if (!StringUtils.isEmpty ( map.get ( "enVisible" ) )) {
                    list.add ( criteriaBuilder.equal ( root.get ( "enVisible" ).as ( String.class ), (String) map.get ( "enVisible" ) ) );
                }

                // 0.未分配 1.已分配
                if (!StringUtils.isEmpty ( map.get ( "type" ) )) {
                    String ty = (String) map.get ( "type" );
                    CriteriaBuilder.In<Object> in = criteriaBuilder.in ( root.get ( "type" ) );
                    if ("0".equals ( ty )) {
                        in.value ( 1 ).value ( 2 );
                    } else {
                        in.value ( Integer.parseInt ( ty ) );
                    }

                }


                return criteriaBuilder.and ( list.toArray ( new Predicate[list.size ()] ) );
            }
        };

        return permissionDao.findAll(spec);
    }



}

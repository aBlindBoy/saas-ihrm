package com.ihrm.system.service;

import com.ihrm.common.utils.IdWorker;
import com.ihrm.domain.system.Role;
import com.ihrm.domain.system.User;
import com.ihrm.system.dao.RoleDao;
import com.ihrm.system.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.*;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private RoleDao roleDao;

    @Autowired
    private IdWorker idWorker;

    public void add( User user ){
        String id = idWorker.nextId ()+ "";
        user.setId ( id );
        user.setPassword ( "123456" );
        user.setEnableState ( 1 );
        User save = userDao.save ( user );
    }


    public void delete( String id ){
        userDao.deleteById ( id );
    }


    public void update( User user ){
        User save = userDao.save ( user );
    }

    public User findById( String id ){
        User user = userDao.findById ( id ).get ();
        return user;
    }

    /**
     * 条件查询
     * @param map 查询条件
     * @param page 页码
     * @param size 页面大小
     * @return
     */
    public Page<User> findAll( Map<String,Object> map,int page,int size){

        Specification<User> spec=new Specification<User> () {
            @Override
            public Predicate toPredicate( Root<User> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder ) {
                List<Predicate> list = new ArrayList<> (  );
                //动态添加查询条件
                if (StringUtils.isEmpty ( map.get ( "companyId" ) )){
                    list.add (criteriaBuilder.equal ( root.get ( "companyId" ).as ( String.class ),(String) map.get ( "companyId" ) ) );
                }
                if (StringUtils.isEmpty ( map.get ( "departmentId" ) )){
                    list.add (criteriaBuilder.equal ( root.get ( "departmentId" ).as ( String.class ),(String) map.get ( "departmentId" ) ) );
                }

                // 0.未分配 1.已分配
                if(!StringUtils.isEmpty(map.get("hasDept"))) {
                    //根据请求的hasDept判断  是否分配部门 0未分配（departmentId = null），1 已分配 （departmentId ！= null）
                    if("0".equals((String) map.get("hasDept"))) {
                        list.add(criteriaBuilder.isNull(root.get("departmentId")));
                    }else {
                        list.add(criteriaBuilder.isNotNull(root.get("departmentId")));
                    }
                }


                return criteriaBuilder.and ( list.toArray ( new Predicate[list.size ()] ) );
            }
        };

//        PageRequest pageRequest = new PageRequest ( page, size );
//        Page<User> userPage = userDao.findAll ( spec, pageRequest );
        Page<User> pageUser = userDao.findAll(spec, new PageRequest(page-1, size));
        // List<User> users = userDao.findAll (getSpec ( companyId ));
        return pageUser;
    }


    /**
     * 分配角色
     */
    public void assignRoles(String userId,List<String> roleIds) {
        //1.根据id查询用户
        User user = userDao.findById(userId).get();
        //2.设置用户的角色集合
        Set<Role> roles = new HashSet<> ();
        for (String roleId : roleIds) {
            Role role = roleDao.findById(roleId).get();
            roles.add(role);
        }
        //设置用户和角色集合的关系
        user.setRoles(roles);
        //3.更新用户
        userDao.save(user);
    }

    public User findByMobile( String mobile ) {
        User user = userDao.findByMobile(mobile);
        return user;
    }
}

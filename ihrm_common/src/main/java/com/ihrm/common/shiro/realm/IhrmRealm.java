package com.ihrm.common.shiro.realm;

import com.ihrm.domain.system.response.ProfileResult;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import java.util.Set;

/**
 * 公共realm域：获取安全数据，构造权限信息
 */
public class IhrmRealm extends AuthorizingRealm {


    @Override
    public void setName( String name ) {
        super.setName ( "ihrmRealm" );
    }

    /**
     * 授权
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo( PrincipalCollection principalCollection ) {
       //1.获取安全数据
        ProfileResult profileResult = (ProfileResult)principalCollection.getPrimaryPrincipal ();

        //2.获取权限信息
        Set<String> apis = (Set<String>)profileResult.getRoles ().get ( "apis" );

        //3.构造返回值
        SimpleAuthorizationInfo info=new SimpleAuthorizationInfo (  );
        info.setStringPermissions ( apis );

        return info;
    }

    /**
     * 认证
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo( AuthenticationToken authenticationToken ) throws AuthenticationException {
        return null;
    }
}

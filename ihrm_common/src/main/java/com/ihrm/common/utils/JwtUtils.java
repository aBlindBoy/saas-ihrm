package com.ihrm.common.utils;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Date;
import java.util.Map;

@Setter
@Getter
@ConfigurationProperties("jwt.config")
public class JwtUtils {

    //签名私钥
    private String key;

    //签名的失效性
    private Long ttl;


    /**
     * 设置认证token
     */
    public String createJwt( String id, String name, Map<String,String> map){
        //1.设置失效时间
        long now=System.currentTimeMillis ();
        long exp=now+ttl;

        //2.创建jwtBuilder
        JwtBuilder jwtBuilder = Jwts.builder ().setId ( id )
                .setSubject ( name )
                .setIssuedAt ( new Date () )
                .signWith ( SignatureAlgorithm.HS256, key );
        //3.根据Map设置claims
        for (Map.Entry<String,String> s : map.entrySet ()) {
            jwtBuilder.claim ( s.getKey (), s.getValue () );
        }

        jwtBuilder.setExpiration ( new Date ( exp ) );
        //4.返回token
        return jwtBuilder.compact ();
    }


    /**
     * 解析token
     */
    public Claims parserJwt(String token){
        Claims body = Jwts.parser ().setSigningKey ( key ).parseClaimsJws ( token ).getBody ();
        return body;
    }


}

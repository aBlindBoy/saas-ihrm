package com.ihrm.common;


import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.junit.Test;

import java.util.Date;

public class TokenTest {

    @Test
    public void createTokenTes(){
        String token = Jwts.builder ().setId ( "1" )
                .setSubject ( "韩茜茜" )
                .setIssuedAt ( new Date () )
                .claim ( "compenyName", "广东云讯" )
                .claim ( "roleName", "Java开发" )
                .signWith ( SignatureAlgorithm.HS256,"ihrm" )
                .compact ();
        System.out.println (token);
    }


    @Test
    public void parserToken(){
        String str = "eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiIxIiwic3ViIjoi6Z-p6Iyc6IycIiwiaWF0IjoxNTc5MDAzNTA3LCJjb21wZW55TmFtZSI6IuW5v-S4nOS6keiuryIsInJvbGVOYW1lIjoiSmF2YeW8gOWPkSJ9.V-ORSR9Fe3JLWZlbik-pkW0Kvti8YnBmUCPBm4H-8vc";
        Claims claims = Jwts.parser ().setSigningKey ( "ihrm" ).parseClaimsJws ( str ).getBody ();
        System.out.println (claims.getId ());
        System.out.println (claims.getSubject ());
        System.out.println (claims.getIssuedAt ());
        System.out.println (claims.get ( "compenyName" ));
        System.out.println (claims.get ( "roleName" ));
    }

}

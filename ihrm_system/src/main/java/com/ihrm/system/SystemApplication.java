package com.ihrm.system;

import com.ihrm.common.utils.IdWorker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(scanBasePackages = "com.ihrm")
@EntityScan("com.ihrm.domain.system")
public class SystemApplication {

    public static void main( String[] args ) {
        SpringApplication.run ( SystemApplication.class );
    }

    @Bean
    public IdWorker idWorker(){
        return new IdWorker (  );
    }



}

package com.ihrm.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Eure服务端
 */
@SpringBootApplication
@EnableEurekaServer
public class EureApplication {

    public static void main(String[] args) {
        SpringApplication.run(EureApplication.class);
    }
}

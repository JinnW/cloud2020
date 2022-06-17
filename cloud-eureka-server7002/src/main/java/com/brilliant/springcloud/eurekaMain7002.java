package com.brilliant.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author: Brilliant_jw
 * @Description:
 * @Date: 2022/6/16 14:44
 * @Version: 1.0
 */
@SpringBootApplication
@EnableEurekaServer
public class eurekaMain7002 {
    public static void main(String[] args) {
        SpringApplication.run(eurekaMain7002.class, args);
    }
}

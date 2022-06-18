package com.brilliant.springcloud;

import com.sun.corba.se.impl.resolver.ORBDefaultInitRefResolverImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: Brilliant_jw
 * @Description:
 * @Date: 2022/6/18 14:44
 * @Version: 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class orderConsulMain80 {
    public static void main(String[] args) {
        SpringApplication.run(orderConsulMain80.class, args);
    }
}

package com.brilliant.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import javax.xml.transform.Templates;

/**
 * @Author: Brilliant_jw
 * @Description:
 * @Date: 2022/6/18 14:51
 * @Version: 1.0
 */
@Configuration
public class ApplicationContextConfig {
    @Bean
    @LoadBalanced
   public RestTemplate restTemplate(){
       return new RestTemplate();
   }
}

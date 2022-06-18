package com.brilliant.springcloud.controller;

import com.brilliant.springcloud.entities.CommonResult;
import com.brilliant.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import javax.websocket.server.PathParam;
import javax.xml.transform.Templates;

/**
 * @Author: Brilliant_jw
 * @Description:
 * @Date: 2022/6/18 14:47
 * @Version: 1.0
 */
@RestController
@Slf4j
public class orderConsulController {

    private static final String PAYMENT_URL="http://consul-order-payment";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/consul/create")
    public CommonResult<Payment> create(Payment payment){
       return restTemplate.postForObject(PAYMENT_URL+"/payment/create" ,  payment, CommonResult.class);
    }
    @GetMapping("/consumer/payment/consul/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        return restTemplate.getForObject(PAYMENT_URL+"/payment/create/get"+id, CommonResult.class);
    }

}

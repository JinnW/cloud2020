package com.brilliant.springcloud.controller;

import com.brilliant.springcloud.entities.CommonResult;
import com.brilliant.springcloud.entities.Payment;
import com.brilliant.springcloud.service.PaymentService;
import com.netflix.discovery.shared.Applications;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: Brilliant_jw
 * @Description:
 * @Date: 2022/6/15 16:31
 * @Version: 1.0
 */
@Slf4j
@RestController
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @Resource
    private DiscoveryClient discoveryClient;

    @PostMapping(value = "/payment/create")
    private CommonResult create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        log.info("************插入结果"+result);
        if (result>0){
            return new CommonResult(200, "数据插入成功！接口为"+serverPort,result);
        }else{
            return new CommonResult(444, "数据插入失败！",null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    private CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        log.info("************查询结果"+payment);
        if (payment != null){
            return new CommonResult(200, "数据查询成功！接口为"+serverPort,payment);
        }else{
            return new CommonResult(444, "数据插入失败！",null);
        }
    }


    @GetMapping("/payment/discovery")
    public Object discovery(){
        List<String> services = discoveryClient.getServices();
        for (String element : services){
            log.info("element="+element);
        }

        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        for (ServiceInstance instance : instances){
            log.info("InstanceId"+instance.getInstanceId()+"\t"+"ServiceId"+instance.getServiceId()+"\t"+"Port"+instance.getPort()+"\t"+"Uri:"+instance.getUri());
        }
        return this.discoveryClient;

    }
}

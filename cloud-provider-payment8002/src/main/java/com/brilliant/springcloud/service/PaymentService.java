package com.brilliant.springcloud.service;

import com.brilliant.springcloud.entities.Payment;

/**
 * @Author: Brilliant_jw
 * @Description:
 * @Date: 2022/6/15 14:54
 * @Version: 1.0
 */
/*@Mapper*/
public interface PaymentService {

    int create(Payment payment);

    Payment getPaymentById(Long id);
}

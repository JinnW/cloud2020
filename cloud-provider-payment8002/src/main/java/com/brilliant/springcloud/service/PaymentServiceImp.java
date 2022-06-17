package com.brilliant.springcloud.service;

import com.brilliant.springcloud.dao.PaymentDao;
import com.brilliant.springcloud.entities.Payment;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: Brilliant_jw
 * @Description:
 * @Date: 2022/6/15 14:54
 * @Version: 1.0
 */
@Service
public class PaymentServiceImp implements PaymentService{

    @Resource
    private PaymentDao paymentDao;


    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}

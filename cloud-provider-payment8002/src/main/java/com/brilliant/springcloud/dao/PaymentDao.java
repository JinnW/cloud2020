package com.brilliant.springcloud.dao;

import com.brilliant.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: Brilliant_jw
 * @Description:
 * @Date: 2022/6/15 11:36
 * @Version: 1.0
 */
@Mapper
public interface PaymentDao {

    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);

}

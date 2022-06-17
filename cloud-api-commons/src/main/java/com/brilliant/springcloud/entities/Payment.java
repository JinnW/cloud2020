package com.brilliant.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author: Brilliant_jw
 * @Description:
 * @Date: 2022/6/15 11:18
 * @Version: 1.0
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Payment implements Serializable {

    private Long id;
    private String serial;
}

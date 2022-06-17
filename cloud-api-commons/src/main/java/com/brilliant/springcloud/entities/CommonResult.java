package com.brilliant.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: Brilliant_jw
 * @Description:
 * @Date: 2022/6/15 11:25
 * @Version: 1.0
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CommonResult<T>{

    private Integer code;
    private String message;
    private T  data;

    public CommonResult(Integer code, String message) {
        this(code,message,null);
    }
}

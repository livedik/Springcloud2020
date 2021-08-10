package com.atguigu.springcloud.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CommonResult<T> {

    private Integer code;
    private String message;
    private T Data;

    public CommonResult(Integer code, String message) {
        this.code = code;
        this.message = message;
        this.Data = null;
    }

    public CommonResult(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        Data = data;
    }
}

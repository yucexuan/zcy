package com.ycx.mybatis.dto;

import lombok.Data;

/**
 * @author yucexuan <yu.cexuan@chinaott.net>
 * @date 2020/12/10 17:22
 * @description
 **/
@Data
public class RestModel<T> {
    private T data;
    private Integer errorCode = 0;
    private String errorMsg;

    public RestModel(){ }

    public RestModel(T data){
        this.data = data;
    }

    public RestModel(Integer errorCode,String errorMsg){
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }
}

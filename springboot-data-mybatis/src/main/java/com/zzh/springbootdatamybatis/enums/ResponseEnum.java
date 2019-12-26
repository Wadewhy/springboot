package com.zzh.springbootdatamybatis.enums;


import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 用于系统返回的枚举类
 *

 */
public enum ResponseEnum {

    /**
     * 系统总体相关
     */
    SUCCESS("0", "success"),
    UNKNOW_ERROR("-1", "未知错误"),
    ERROR("999", "请求处理失败");

    @Setter
    @Getter
    private String code;

    @Setter
    @Getter
    private String message;

    ResponseEnum(String code, String msg) {
        this.code = code;
        this.message = msg;
    }
}

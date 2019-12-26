package com.zzh.springbootdatamybatis.exception;

import com.zzh.springbootdatajpa.enums.ResponseEnum;
import lombok.Getter;
import lombok.Setter;

/**
 * @PACKAGE_NAME: com.zzh.springbootweberror.exception
 * @NAME: BaseException
 * @Author: 钟子豪
 * @DATE: 2019/12/24
 * @MONTH_NAME_FULL: 十二月
 * @DAY: 24
 * @DAY_NAME_FULL: 星期二
 * @PROJECT_NAME: springboot
 * 自定义异常类
 **/
@Getter
@Setter
public class BaseException extends RuntimeException{
    private String code;
    public BaseException(String message, String code) {
        super(message);
        this.code = code;
    }

    public BaseException(ResponseEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }
}

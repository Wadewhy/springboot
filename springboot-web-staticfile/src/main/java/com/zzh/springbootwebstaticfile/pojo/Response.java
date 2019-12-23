package com.zzh.springbootwebstaticfile.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @PACKAGE_NAME: com.zzh.springbootwebstaticfile.pojo
 * @NAME: Response
 * @Author: 钟子豪
 * @DATE: 2019/12/22
 * @MONTH_NAME_FULL: 十二月
 * @DAY: 22
 * @DAY_NAME_FULL: 星期日
 * @PROJECT_NAME: springboot
 * 响应实体类封装
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Response<T> {
    //响应码
    private String code;
    //响应信息
    private String message;
    //响应数据
    private T data;
}

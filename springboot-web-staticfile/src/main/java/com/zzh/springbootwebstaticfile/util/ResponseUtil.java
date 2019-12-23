package com.zzh.springbootwebstaticfile.util;

import com.zzh.springbootwebstaticfile.pojo.Response;

/**
 * @PACKAGE_NAME: com.zzh.springbootwebstaticfile.util
 * @NAME: ResponseUtil
 * @Author: 钟子豪
 * @DATE: 2019/12/22
 * @MONTH_NAME_FULL: 十二月
 * @DAY: 22
 * @DAY_NAME_FULL: 星期日
 * @PROJECT_NAME: springboot
 **/
public class ResponseUtil {

    public static Response success(Object data) {
        return new Response("0000", "success", data);
    }

    public static Response success() {
        return new Response("0000", "success", null);
    }

    public static Response error(String code, String message) {
        return new Response(code, message, null);
    }
}


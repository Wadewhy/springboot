package com.zzh.springbootweberror.util;


import com.zzh.springbootweberror.enums.ResponseEnum;
import com.zzh.springbootweberror.pojo.Response;

import java.util.ArrayList;
import java.util.Collection;

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

    public static Response success(Object objects) {
        ArrayList list = new ArrayList<>();
        if (!(objects instanceof Collection)) {
            list.add(objects);
        } else {
            list = (ArrayList) objects;
        }
        return new Response("0000", "success", list);
    }

    public static Response success() {
        return success(null);
    }

    public static Response error(String code, String message) {
        return new Response(code, message, new ArrayList<>());
    }

    public static Response error(ResponseEnum responseEnum) {
        return error(responseEnum.getCode(), responseEnum.getMessage());
    }
}


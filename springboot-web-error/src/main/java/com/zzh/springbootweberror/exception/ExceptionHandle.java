package com.zzh.springbootweberror.exception;

import com.zzh.springbootweberror.enums.ResponseEnum;
import com.zzh.springbootweberror.pojo.Response;
import com.zzh.springbootweberror.util.ResponseUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @PACKAGE_NAME: com.zzh.springbootweberror.exception
 * @NAME: ExceptionHandle
 * @Author: 钟子豪
 * @DATE: 2019/12/24
 * @MONTH_NAME_FULL: 十二月
 * @DAY: 24
 * @DAY_NAME_FULL: 星期二
 * @PROJECT_NAME: springboot
 *
 * 统一的异常处理
 **/
@Slf4j
@ControllerAdvice
public class ExceptionHandle {
    @ResponseBody
    @ExceptionHandler(Exception.class)
    public Response handleException(Exception e) {
        log.info("异常 {}", e);
        if (e instanceof BaseException) {
            BaseException exception = (BaseException) e;
            String code = exception.getCode();
            String message = exception.getMessage();
            return ResponseUtil.error(code, message);
        }
        return ResponseUtil.error(ResponseEnum.UNKNOW_ERROR);
    }


    /**
     * 判断是否是Ajax请求
     *
     * @param request
     * @return
     */
    public static boolean isAjax(HttpServletRequest request) {
        String rquested = request.getHeader("X-Rquested-With");
        if (request == null) {
            return false;
        }
        if (!"XMLHttpRequest".equals(rquested.toString())) {
            return false;
        }
        return true;
    }

}

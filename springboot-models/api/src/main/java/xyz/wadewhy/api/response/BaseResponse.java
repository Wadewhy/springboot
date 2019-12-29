package xyz.wadewhy.api.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import xyz.wadewhy.api.enums.StatusCode;

/**
 * @PACKAGE_NAME: xyz.wadewhy.api.response
 * @NAME: BaseResponse
 * @Author: 钟子豪
 * @DATE: 2019/12/29
 * @MONTH_NAME_FULL: 十二月
 * @DAY: 29
 * @DAY_NAME_FULL: 星期日
 * @PROJECT_NAME: springboot-models
 * 状态码
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BaseResponse<T> {
    //返回状态码
    private Integer code;
    //返回信息
    private String msg;
    //返回对象
    private T data;

    public BaseResponse(StatusCode statusCode) {
        this.code = statusCode.getCode();
        this.msg = statusCode.getMsg();
    }
}

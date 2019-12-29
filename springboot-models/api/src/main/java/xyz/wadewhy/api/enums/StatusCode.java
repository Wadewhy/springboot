package xyz.wadewhy.api.enums;

/**
 * @Author 钟子豪
 * @Date 2019/12/29
 * @description  状态码
 No such property: code for class: Script1
 * @Return
 */
public enum StatusCode {
    Success(0,"成功"),
    Fail(-1,"失败"),
    InvalidParams(200,"无效的参数");

    private Integer code;
    private String msg;

     StatusCode(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}

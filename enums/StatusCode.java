package com.easyse.easyse_simple.enums;

/**
 * @Auther: zky2002
 * @Description: 状态码枚举类
 */
public enum StatusCode {
    SUCCESS("success",200),ERROR("error",500),NOT_FOUND("error",404);
    private String msg;
    private Integer code;

    StatusCode(String msg, Integer code){
        this.msg = msg;
        this.code = code;
    }
    StatusCode(Integer code){
        this.code = code;
    }
    StatusCode(String msg){
        this.msg = msg;
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
    public Integer getCode() {
        return code;
    }
    public void setCode(Integer code) {
        this.code = code;
    }
}
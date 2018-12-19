package com.pengzc.allcommon.exception;

/**
 * @author pengzc
 * @Description: 基础异常类
 * @date 2018/11/210:03
 */
public class BaseException extends RuntimeException{
    /**
     * 错误编码
     */
    protected String code;

    public BaseException() {}

    public BaseException(String message) {
        super(message);
    }

    public BaseException(String code, String message) {
        super(message);
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}

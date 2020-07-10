package com.shuanghong.smart.domain;

import lombok.Data;

/**
 * @Description
 * @Author
 * @Date 2020-07-07 19:23
 */
@Data
public class Result {

    private int code;

    private String msg;

    private Object data;

    public Result(Integer code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public Result() {
    }

    public Result success(String msg) {
        this.code = 200;
        this.msg = msg;
        return this;
    }

    public Result success() {
        this.code = 200;
        this.msg = "操作成功";
        return this;
    }

    public Result success(Object data) {
        this.code = 200;
        this.msg = "操作成功";
        this.data = data;
        return this;
    }

    public Result error(String msg) {
        this.code = 500;
        this.msg = msg;
        return this;
    }

    public Result error() {
        this.code = 500;
        this.msg = "操作失败";
        return this;
    }

    public Result error(int code, String msg) {
        this.code = code;
        this.msg = msg;
        return this;
    }
}

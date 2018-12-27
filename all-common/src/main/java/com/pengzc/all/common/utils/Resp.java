
package com.pengzc.all.common.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * Resp
 *
 * @author pengzc
 * @create 2018-12-19 11:18
 * @desc 返回参数
 **/
public class Resp extends HashMap<String, Object> {
    private static final long serialVersionUID = 1L;

    public Resp() {
        put("code", 0);
        put("msg", "success");
    }

    public static Resp error() {
        return error(500, "未知异常，请联系管理员");
    }

    public static Resp error(String msg) {
        return error(500, msg);
    }

    public static Resp error(int code, String msg) {
        Resp resp = new Resp();
        resp.put("code", code);
        resp.put("msg", msg);
        return resp;
    }

    public static Resp ok(String msg) {
        Resp resp = new Resp();
        resp.put("msg", msg);
        return resp;
    }

    public static Resp ok(Map<String, Object> map) {
        Resp resp = new Resp();
        resp.putAll(map);
        return resp;
    }

    public static Resp ok() {
        return new Resp();
    }

    @Override
    public Resp put(String key, Object value) {
        super.put(key, value);
        return this;
    }

    public static Resp toMap(String key, Object value) {
        Resp resp = new Resp();
        resp.clear();
        resp.put(key, value);
        return resp;

    }
}

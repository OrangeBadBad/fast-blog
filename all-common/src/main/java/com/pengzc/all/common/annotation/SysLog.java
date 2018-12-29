package com.pengzc.all.common.annotation;

import java.lang.annotation.*;

/**
 * SysLog
 *
 * @author pengzc
 * @desc 系统请求日志
 * @date 2018年3月8日 上午10:19:56
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface SysLog {
    String value() default "";
}

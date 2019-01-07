package com.pengzc.all.common.annotation;

import java.lang.annotation.*;

/**
 * like查询
 *
 * @author pengzc
 * @since 3.0.0 2018-08-12
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MpEQ {

    /**
     * <p>
     * 真实查询的字段,填写属性名 多个参数是or连接
     * </p>
     */
    String[] value() default {};


}

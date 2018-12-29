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
public @interface MpBetween {

    /**
     * <p>
     * 真实查询的字段,填写属性名
     * </p>
     */
    String value() default "";

    /**
     * <p>
     * 大于、小于、 大于等于、小于等于
     * </p>
     */
    ConditionType type();


}

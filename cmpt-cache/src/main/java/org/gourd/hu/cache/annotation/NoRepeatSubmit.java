package org.gourd.hu.cache.annotation;

import org.springframework.core.annotation.AliasFor;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/**
 * @功能描述 防止重复提交标记注解
 * @author gourd
 * @date 2018-08-26
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface NoRepeatSubmit {
    /**
     * 重复统计时长
     * @return
     */
    int time() default 1;

    @AliasFor("time")
    int value() default 1;
}
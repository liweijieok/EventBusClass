package com.github.liweijie.eventbusclass.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * EventBus Class注解
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.SOURCE)
public @interface EventBusClass {
    /**
     *
     *  指定生成的类名
     * @return
     */
    String name();
}

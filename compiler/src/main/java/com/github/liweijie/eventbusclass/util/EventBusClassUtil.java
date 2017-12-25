package com.github.liweijie.eventbusclass.util;

/**
 * 作者：黎伟杰 on 2017/12/24.
 * 邮箱：liweijie@qq.com
 * description：工具类
 * update by:
 * update day:
 */
public class EventBusClassUtil {

    private EventBusClassUtil() {
        throw new IllegalStateException("not allow init");
    }

    public static boolean isEmpty(String... args) {
        if (args == null || args.length == 0) {
            return true;
        }
        for (String item : args) {
            if (item == null || "".equals(item)) {
                return true;
            }
        }
        return false;
    }

}

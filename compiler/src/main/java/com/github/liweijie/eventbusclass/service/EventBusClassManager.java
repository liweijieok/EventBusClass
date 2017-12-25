package com.github.liweijie.eventbusclass.service;

import com.github.liweijie.eventbusclass.constants.Constants;
import com.github.liweijie.eventbusclass.domain.Event;
import com.github.liweijie.eventbusclass.util.EventBusClassUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * 作者：黎伟杰 on 2017/12/24.
 * 邮箱：liweijie@qq.com
 * description：
 * update by:
 * update day:
 */
public class EventBusClassManager {

    /**
     * 保存路径
     * /modulename/code
     */
    private Map<Integer, String> mPaths;

    public EventBusClassManager() {
        this.mPaths = new HashMap<>();
    }

    private static class EventBusClassManagerHolder {
        private static final EventBusClassManager INSTANCE = new EventBusClassManager();
    }


    public static EventBusClassManager getInstace() {
        return EventBusClassManagerHolder.INSTANCE;
    }

    /**
     * 获取生成类的path
     *
     * @return
     */
    public String getPath(Integer key) {

        String s = mPaths.get(key);
        if (EventBusClassUtil.isEmpty(s)) {
            return null;
        }
        return Constants.SOURCE_NAME + s;
    }


    public boolean addPath(Integer key, String value) {
        if (EventBusClassUtil.isEmpty(value)) {
            System.out.println("添加的 path 为 null，对应的code是--->" + key);
            return false;
        }
        String origin = mPaths.get(key);
        if (!EventBusClassUtil.isEmpty(origin)) {
            System.out.println("添加的 path 为 已经存在，对应的code是"
                    + key + ",旧的value为-->" + origin
                    + ",替换为 新的value--->" + value);
            mPaths.put(key, value);
            return false;
        }

        mPaths.put(key, value);
        return true;

    }

    public Event getReal(Event event) {
        return null;
    }


}

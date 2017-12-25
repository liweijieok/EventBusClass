package com.liweijie.github.eventbusclas.api;

import com.github.liweijie.eventbusclass.domain.Event;
import com.github.liweijie.eventbusclass.service.EventBusClassManager;

import org.greenrobot.eventbus.EventBus;

/**
 * 作者：黎伟杰 on 2017/12/24.
 * 邮箱：liweijie@qq.com
 * description：对EventBus的一层简单封装
 *  自己假如对Event bus有另外的处理，可以继承这个类，或者是自己另外封装也行
 *  这里只是做了简单的包裹
 * update by:
 * update day:
 */
public class ParcelEventBus {

    private static ParcelEventBus INSTANCE = new ParcelEventBus();

    public static ParcelEventBus getDefault() {
        return INSTANCE;
    }

    /**
     * 注册
     *
     * @param object
     */
    public void register(Object object) {
        if (EventBus.getDefault().isRegistered(object)) {
            return;
        }
        EventBus.getDefault().register(object);

    }

    /**
     * @param object
     */
    public void unregister(Object object) {
        if (!EventBus.getDefault().isRegistered(object)) {
            return;
        }
        EventBus.getDefault().unregister(object);
    }

    /**
     * 发送事件
     *
     * @param event event
     */
    public void post(Event event) {
        Event real = EventBusClassManager.getInstace().getReal(event);
        EventBus.getDefault().post(real);
    }

    /**
     * post stick
     *
     * @param event event
     */
    public void postSticky(Event event) {
        Event real = EventBusClassManager.getInstace().getReal(event);
        EventBus.getDefault().postSticky(real);
    }

    /**
     * 移除stick
     *
     * @param event event
     */
    public void removeStick(Event event) {
        EventBus.getDefault().removeStickyEvent(event);
    }
}

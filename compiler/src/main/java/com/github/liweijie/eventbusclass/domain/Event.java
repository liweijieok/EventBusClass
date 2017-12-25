package com.github.liweijie.eventbusclass.domain;

/**
 * 作者：黎伟杰 on 2017/12/24.
 * 邮箱：liweijie@qq.com
 * description：Eventbus post的类封装
 * update by:
 * update day:
 */
public class Event {

    /**
     * code 唯一必须字段
     */
    private int code;
    /**
     * 可以是非传字段，携带数据的
     */
    private Object data;
    /**
     * 额外数据
     */
    private String extra;
    /**
     * 时间戳
     */
    private long timeStamp;

    public Event(int code, Object data, String extra, long timeStamp) {
        this.code = code;
        this.data = data;
        this.extra = extra;
        this.timeStamp = timeStamp;
    }

    public Event(int code) {
        this.code = code;
    }

    public Event(int code, Object data) {
        this.code = code;
        this.data = data;
    }

    public Event(int code, Object data, String extra) {
        this.code = code;
        this.data = data;
        this.extra = extra;
    }

    public Event(int code, Object data, long timeStamp) {
        this.code = code;
        this.data = data;
        this.timeStamp = timeStamp;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public <T> T getData() {
        return (T) data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }
}

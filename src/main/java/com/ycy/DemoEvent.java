package com.ycy;


import org.springframework.context.ApplicationEvent;

/**
 * Created by ycy on 16/4/8.
 * 自定义事件
 */
public class DemoEvent extends ApplicationEvent {

    private static final long serivalVersionUID = 1L;
    private String msg;

    public DemoEvent(Object source, String msg) {
        super(source);
        this.msg = msg;
    }


    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}

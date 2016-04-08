package com.ycy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Component;

/**
 * Created by ycy on 16/4/8.
 * 事件发布类
 * 1\注入applicationContext用来发布事件
 * 2\使用applicationContext的publish方法来发布
 */
@Component
public class DemoPublish {
    @Autowired
    ApplicationContext applicationContext;

    public void publish(String msg) {
        applicationContext.publishEvent(new DemoEvent(this, msg));
    }
}

package com.ycy;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by ycy on 16/4/8.
 * 事件监听器
 * 1\实现了applicationLisentenner 制定监听的事件类型
 * 2\使用onaapplicationEvent方法接受处理消息
 */
@Component
public class DemoListenner implements ApplicationListener<DemoEvent> {//1

    public void onApplicationEvent(DemoEvent demoEvent) {//2
        String msg = demoEvent.getMsg();

        System.out.println("监听器接收到了msg,打印处理:" + msg);
    }

}

package com.ycy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by ycy on 16/4/8.
 */
@Configuration
@ComponentScan("com.ycy")
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Main.class);

        DemoPublish demoPublish = context.getBean(DemoPublish.class);
        demoPublish.publish("hello application event");

        context.close();
    }
}

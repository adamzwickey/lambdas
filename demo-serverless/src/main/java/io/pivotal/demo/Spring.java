package io.pivotal.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

/**
 * Created by azwickey on 1/26/17.
 */
public class Spring {

    private static ApplicationContext springContext = null;
    private static ApplicationContext getSpringContext() {
        if(springContext == null) {
            synchronized (ApplicationContext.class) {
                if(springContext == null) {
                    springContext = SpringApplication.run(DemoServerlessApplication.class, new String[0]);
                }
            }
        }
        return springContext;
    };

    public static <T> T getBean(Class<T> clazz) {
        return getSpringContext().getBean(clazz);
    }
}

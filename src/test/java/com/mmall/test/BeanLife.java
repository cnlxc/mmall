package com.mmall.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

/**
 * Created by 82138 on 2019/3/10.
 */
public class BeanLife {
    public static void main(String[] args) {
        ApplicationContext factory = new AnnotationConfigApplicationContext(BeanConfig.class);
        Person person = factory.getBean("person",Person.class);
        System.out.println(person );
        ((AnnotationConfigApplicationContext)factory).registerShutdownHook();

    }
}

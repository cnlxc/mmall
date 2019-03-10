package com.mmall.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by 82138 on 2019/3/10.
 */
@Configuration
public class BeanConfig {
    @Bean(initMethod="myInit")
    @PostConstruct
    @PreDestroy
    public Person person(){
        Person person = new Person();
        person.setName("lxc");
        person.setAddress("bijing");
        return person;
    }
}

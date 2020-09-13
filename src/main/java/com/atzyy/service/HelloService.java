package com.atzyy.service;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class HelloService {

    private String name;

    public HelloService() {
        System.out.println("。。。无参构造函数");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("。。。属性set方法");
        this.name = name;
    }

    public void sayHello(String name){
        System.out.println("hello " + name);
    }

    public void init(){
        System.out.println("。。。init方法");
    }
}

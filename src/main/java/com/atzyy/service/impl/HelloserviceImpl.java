package com.atzyy.service.impl;

import com.atzyy.service.HelloService2;

public class HelloserviceImpl implements HelloService2 {
    @Override
    public void sayHi(String name) {
        System.out.println("hi " + name);
    }
}

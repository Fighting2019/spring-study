package com.atzyy.service;

import org.springframework.aop.framework.ProxyFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//@Advice
public class AspectService implements InvocationHandler {

    public AspectService(Object obj) {
        this.obj = obj;
    }

    @Autowired
    private Object obj;

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("动态代理执行");
        Object invoke = method.invoke(obj, args);
        System.out.println("代理结束");
        return invoke;
    }
}

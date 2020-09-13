package com.atzyy.service;

//@Advice
public class AspectService {

    @Before
    public void before(){
        System.out.println("before");
    }
}

package com.atzyy;

import static org.junit.Assert.assertTrue;

import com.atzyy.service.DeptInfoService;
import com.atzyy.service.HelloService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Unit test for simple App.
 */
public class AppTest {

    /*@Autowired
    private HelloService helloService;*/
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void beanTest(){
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("spring-bean1.xml");
        HelloService helloService = applicationContext.getBean(HelloService.class);
        helloService.sayHello("first project");
    }

    @Test
    public void beanTest2(){
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("spring-bean1.xml");
        DeptInfoService deptInfoService = applicationContext.getBean(DeptInfoService.class);
        deptInfoService.deptInfoFirstService();
    }
}

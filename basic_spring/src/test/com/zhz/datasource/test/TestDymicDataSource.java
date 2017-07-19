package com.zhz.datasource.test;

import com.zhz.service.TestService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zz1987 on 17/7/19.
 */
public class TestDymicDataSource {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        context.start();
        TestService service = (TestService) context.getBean("testService");
        service.test();
    }
}

package com.zhz.mq.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zz1987 on 17/7/20.
 */
public class TestMqProducer {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        context.start();
        MqProducer producer = (MqProducer) context.getBean("mqProducer");
        Map<String,String> map = new HashMap<String, String>();
        map.put("data","hello world");
        producer.sendMsg("test_mq_exchange","test_mq_patt",map);
    }
}

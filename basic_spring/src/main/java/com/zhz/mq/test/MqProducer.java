package com.zhz.mq.test;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zz1987 on 17/7/20.
 */
@Service
public class MqProducer {

    @Autowired
    AmqpTemplate amqpTemplate;

    public void sendMsg(String exchange_key,String queue_key,Object object){
        amqpTemplate.convertAndSend(exchange_key,queue_key,object);
    }
}

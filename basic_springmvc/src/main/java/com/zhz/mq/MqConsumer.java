package com.zhz.mq;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.stereotype.Service;

/**
 * Created by zz1987 on 17/7/20.
 */
@Service("mqConsumer")
public class MqConsumer implements MessageListener{

    public void onMessage(Message message) {
        System.out.println(message.toString());
    }
}

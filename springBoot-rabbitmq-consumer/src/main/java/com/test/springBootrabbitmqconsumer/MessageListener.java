package com.test.springBootrabbitmqconsumer;


import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {

    @RabbitListener(queues = MQConfig.MESSAGE_QUEUE)
    public void listener (CustomMessage customMessage){
        System.out.println("Received Message from Queue: "+customMessage);
    }

}

package zhang.stream002.controller;


import org.apache.zookeeper.server.quorum.Vote;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.integration.annotation.IdempotentReceiver;
import org.springframework.integration.annotation.InboundChannelAdapter;
import org.springframework.messaging.Message;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.annotation.SendToUser;
import org.springframework.web.bind.annotation.RestController;

@EnableBinding(Sink.class)
public class hello {


    @Value("${server.port}")
    private String port;
    @StreamListener(Sink.INPUT)
    public void input(Message<String> message){

        System.out.println("消费者2号...........");
        System.out.println(message.getPayload()+"......."+port);


    }
}

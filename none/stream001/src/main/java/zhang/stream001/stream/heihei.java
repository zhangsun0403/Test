package zhang.stream001.stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.Message;


public class heihei {





    public void heihei(Message<String> message){

        System.out.println(message.getPayload());
    }
}

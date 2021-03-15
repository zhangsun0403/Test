package zhang.stream001.stream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;
import org.springframework.stereotype.Component;

@Component
public interface outputMessage  {


    String heihei="inputt";
    String haha="outputt";


    @Output(outputMessage.haha)
    MessageChannel output();

    @Input(outputMessage.heihei)
    SubscribableChannel input();


}

package zhang.stream001.stream;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import javax.annotation.Resource;
import java.util.UUID;

@EnableBinding(value = {outputMessage.class})
public class daoImpl implements hoho{



    @Resource
    outputMessage outputMessage;




    public String send(){


        String s=UUID.randomUUID().toString();

        outputMessage.output().send(MessageBuilder.withPayload(s).build());
        System.out.println(s);

        return null;
    }

}

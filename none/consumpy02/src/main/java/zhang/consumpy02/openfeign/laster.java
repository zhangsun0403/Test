package zhang.consumpy02.openfeign;

import org.springframework.stereotype.Component;

@Component
public class laster implements Aoliao {



    @Override
    public String name(Integer id) {

        return "haha...叫你不好好练习。。。不会了吧..";
    }
}

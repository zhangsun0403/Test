package Entity;

import Aop.Abcd;
import Aop.aspestjZjk;
import Webconfig.ConfigWeb;
import controller.nihaoma;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import service.play;
import service.a;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.Map;

//@Configurable
@Component
public class domain {


    @Autowired
    Abcd abcd;

    public void sss(){


        abcd.haha();

    }

}

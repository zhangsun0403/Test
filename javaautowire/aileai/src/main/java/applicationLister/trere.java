package applicationLister;

import org.springframework.context.ApplicationEvent;

public class trere extends ApplicationEvent {
    public trere(Object source) {
        super(source);
    }

    public void dds(){
        System.out.println("我发布了事件");
    }
}

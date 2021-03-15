package zhang.consumpy02.openfeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@FeignClient(name = "service01",fallback =laster.class )
public interface Aoliao {

    @GetMapping("/name")
    public String name( @RequestParam("id")Integer id);
}

package zhang.comsumpy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;
import zhang.nice.haha;

@SpringBootApplication
@EnableDiscoveryClient
@RibbonClient(name = "service01",configuration = {haha.class})
public class ComsumpyApplication {

	public static void main(String[] args) {

		SpringApplication.run(ComsumpyApplication.class, args);

	}

}

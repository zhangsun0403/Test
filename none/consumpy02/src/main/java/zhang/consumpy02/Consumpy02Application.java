package zhang.consumpy02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class Consumpy02Application {

	public static void main(String[] args) {
		SpringApplication.run(Consumpy02Application.class, args);
	}

}

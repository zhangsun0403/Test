package zhang.stream003;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Stream003Application {

	public static void main(String[] args) {
		SpringApplication.run(Stream003Application.class, args);
	}

}

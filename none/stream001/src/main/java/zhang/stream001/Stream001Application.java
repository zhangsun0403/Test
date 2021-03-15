package zhang.stream001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Stream001Application {

	public static void main(String[] args) {
		SpringApplication.run(Stream001Application.class, args);
	}

}

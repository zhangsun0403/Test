package zhang.stream002;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Stream002Application {

	public static void main(String[] args) {
		SpringApplication.run(Stream002Application.class, args);
	}

}

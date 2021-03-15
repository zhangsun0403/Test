package zhang.huancun;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;



@SpringBootApplication
@MapperScan(basePackages={"zhang.huancun.mapperscan"})
@EnableCaching
public class HuancunApplication {

	public static void main(String[] args) {
		SpringApplication.run(HuancunApplication.class, args);
	}

}

package zhang.testheihei;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.ZonedDateTime;
import java.util.Date;

@SpringBootTest
class TestHeiheiApplicationTests {

	@Test
	void contextLoads() {

		ZonedDateTime c=ZonedDateTime.now();
		System.out.println(c);
	}

}

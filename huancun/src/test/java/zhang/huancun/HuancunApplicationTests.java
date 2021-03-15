package zhang.huancun;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.util.ClassUtils;
import zhang.huancun.test.a;
import zhang.huancun.test.b;

import javax.annotation.Resource;
import javax.sql.DataSource;

@SpringBootTest
class HuancunApplicationTests {


	@Resource
	private JdbcTemplate JdbcTemplate;
	@Test
	void contextLoads() {

		DataSource dataSource =JdbcTemplate.getDataSource();

		System.out.println(dataSource.getClass());
	}

	@Test
	void contexsstLoads() {


		System.out.println(ClassUtils.getPackageName(a.class));
	}

}

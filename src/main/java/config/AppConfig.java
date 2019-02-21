package config;

import config.bean.MyBean;
import config.bean.MyBeanImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by rnthd2 on 2019. 2. 21..
 */
@Configuration
public class AppConfig {
	@Bean
	public MyBean getBean(){
		return new MyBeanImpl();
	}
}

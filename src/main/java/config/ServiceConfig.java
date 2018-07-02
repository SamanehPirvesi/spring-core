package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dao.DaoExample;
import service.ServiceExample;


@Configuration
public class ServiceConfig {
	@Bean
	public ServiceExample serviceExample(DaoExample daoExample) {
		return new ServiceExample(daoExample);
	}
}

package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dao.DaoExample;
import model.SpringTest;

@Configuration
public class DaoConfig {

	
	@Bean
	public DaoExample daoExample(SpringTest spt) {
		return new DaoExample(spt);
	}
}

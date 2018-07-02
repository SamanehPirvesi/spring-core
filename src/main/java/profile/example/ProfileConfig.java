package profile.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import model.SpringTest;

@Configuration
public class ProfileConfig {
	@Bean
	@Profile("dev")
	public SpringTest springTestDev() {
		return new SpringTest("this from Dev");
	}
	
	@Bean
	@Profile("prod")
	public SpringTest springTestProd() {
		return new SpringTest("this from Prod");
	}
	
}

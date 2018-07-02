package profile.different.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

import model.SpringTest;

@Configuration
@PropertySource(value = { "classpath:/application-${spring.profiles.active}.properties" })
public class ProfilePropertiesConfig {
	@Value("${test.msg}")
	private String msg;
	@Bean
	public SpringTest springTest() {
		return new SpringTest(msg);
	}
	
	
}

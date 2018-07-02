package config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import dao.DaoExample;
import lifeCycle.test.LifeCycleTest;
import model.SpringTest;
import scope.test.TestScope;
import service.ServiceExample;

@Configuration
@Import(value = {ServiceConfig.class,DaoConfig.class})
@PropertySource(value = { "classpath:/application.properties" })
public class Config {
	@Value("${test.msg}")
	private String msg;
	
	
	@Bean
	public SpringTest springTest() {
		return new SpringTest(msg);
	}
	
	@Bean
//	@Scope("singleton") default behaviour
	@Scope("prototype") // create one new instance every time
	public TestScope testScope() {
		return new TestScope();
	}
	
	@Bean
	public LifeCycleTest lifeCycleTest() {
		return new LifeCycleTest();
	}
}

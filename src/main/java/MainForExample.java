import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import config.Config;
import lifeCycle.test.LifeCycleTest;
import model.SpringTest;
import scope.test.TestScope;
import service.ServiceExample;

public class MainForExample {

	public static void main(String[] args) {
		ApplicationContext contex=new AnnotationConfigApplicationContext(Config.class);
//		SpringTest springTest=(SpringTest) contex.getBean("springTest");
//		springTest.printYourMessage();
		
		ServiceExample serviceExample=(ServiceExample) contex.getBean("serviceExample");
       serviceExample.printFromDao();
		
//		TestScope testScope=(TestScope) contex.getBean("testScope");
//		TestScope testScope2=(TestScope) contex.getBean("testScope");
//		TestScope testScope3=(TestScope) contex.getBean("testScope");
//		
//		LifeCycleTest lifeCycleTest=(LifeCycleTest) contex.getBean("lifeCycleTest");
		
	    ((AbstractApplicationContext) contex).close();
	}

}
 
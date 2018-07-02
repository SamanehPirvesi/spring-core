package properties.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.Config;
import service.ServiceExample;

public class PropertiesMainExample {

	public static void main(String[] args) {

			ApplicationContext contex=new AnnotationConfigApplicationContext(Config.class);
		
			ServiceExample serviceExample=(ServiceExample) contex.getBean("serviceExample");
	       serviceExample.printFromDao();
			

		}

	}



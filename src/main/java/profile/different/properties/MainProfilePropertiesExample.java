package profile.different.properties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import model.SpringTest;


public class MainProfilePropertiesExample {

	public static void main(String[] args) {
		ApplicationContext contex=new AnnotationConfigApplicationContext(ProfilePropertiesConfig.class);
		SpringTest springTest=(SpringTest) contex.getBean(SpringTest.class);
		springTest.printYourMessage();
		

	}

}
 
package lifeCycle.test;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class LifeCycleTest  {
  
	public  LifeCycleTest() {
		System.out.println("LifeCycleTest constructor ");
	}
	@PostConstruct
	public void myCustumPostConstructMethod() {
		System.out.println("myCustumPostConstructMethod   has been called");
	}
	
	@PreDestroy
	public void myCustumPreDestroyMethod() {
		System.out.println("myCustumPreDestroyMethod   has been called");
	}
}

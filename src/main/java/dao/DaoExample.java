package dao;

import model.SpringTest;

public class DaoExample {
 private SpringTest springTest;
 
  
 
  
  public DaoExample(SpringTest springTest) {
	this.springTest = springTest;
}



public void printMyMsg() {
	  springTest.printYourMessage();
  }
}

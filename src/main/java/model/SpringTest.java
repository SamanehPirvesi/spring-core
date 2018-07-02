package model;

public class SpringTest {
	private String msg;

	public SpringTest() {

	}

	public SpringTest(String msg) {

		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	public void printYourMessage() {
		System.out.println(msg);
	}

}

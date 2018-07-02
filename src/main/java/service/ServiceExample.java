package service;

import dao.DaoExample;

public class ServiceExample {
	private DaoExample edao;

	public ServiceExample(DaoExample edao) {
   System.out.println("service has been created");
		this.edao = edao;
	}
	
	public void printFromDao() {
		edao.printMyMsg();
	}

}

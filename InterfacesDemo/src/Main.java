
public class Main {

	public static void main(String[] args) {

		//interfaceler newlenmez imxa ta��rlar
		CustomerManager customerManager=new CustomerManager(new OracleCustomerDal());
		
		customerManager.add();
	}

}

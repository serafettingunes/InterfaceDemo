
public class Main {

	public static void main(String[] args) {

		//interfaceler newlenmez imxa taþýrlar
		CustomerManager customerManager=new CustomerManager(new OracleCustomerDal());
		
		customerManager.add();
	}

}

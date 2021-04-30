package inheritance;

public class Main {

	public static void main(String[] args) {
		
	individualCustomer muco = new individualCustomer();
	muco.customerNumber = "12345";
	
	CorporateCustomer hepsiBurada = new CorporateCustomer();
    hepsiBurada.customerNumber = "78978";
    
    CustomerManager customerManager = new CustomerManager();
    
    Customer[] customers = {muco, hepsiBurada};
    
    customerManager.addMultiple(customers);
	}

}

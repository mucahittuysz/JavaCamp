package interfaceAbstractDemo;

public class SturbucksCustomerManager extends BaseCustomerManager  {

	private ICustomerCheckService _customerCheckService;
	
	public SturbucksCustomerManager (ICustomerCheckService customerCheckService) {
		super();
		this._customerCheckService = customerCheckService;
	}
	
	public void save(Customer customer) {
	    if(_customerCheckService.CheckIfRealPerson(customer)) 
	     {
		this.save(customer);
	     }
	else {
		 System.out.println("Not a valid person");
	     }
	
}


}

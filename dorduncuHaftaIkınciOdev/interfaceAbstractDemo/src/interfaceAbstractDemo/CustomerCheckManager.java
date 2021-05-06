package interfaceAbstractDemo;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class CustomerCheckManager implements ICustomerCheckService {

	public boolean CheckIfRealPerson (Customer customer) 
	{	
		return true;
	}

}

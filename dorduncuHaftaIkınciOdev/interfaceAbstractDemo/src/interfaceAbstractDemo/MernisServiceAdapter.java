package interfaceAbstractDemo;

import tr.gov.nvi.tckimlik.WS.KPSPublic;

public class MernisServiceAdapter implements ICustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
	
	KPSPublicSoapClient client = new KPSPublicSoapClient();
	return client.TcKimlikDogrula(customer.nationalityId,customer.firstName.toUpperCase(),customer.lastName.toUpperCase(),customer.dateOfBirth.getYear());
	}

}

package interfaceAbstractDemo;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements ICustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
	
			KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
			return kpsPublicSoapProxy.TCKimlikNoDogrula(
					Long.parseLong(customer.getNationalityId()),
					customer.getFirstName().toUpperCase() ,
					customer.getLastName().toUpperCase(),
					customer.getDateOfBirth());
	}
}

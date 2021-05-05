package interfaces;

public class MySqlCustomerDal implements ICustomerDal, IRepostory {

	@Override
	public void add() {
		System.out.println("My sql eklendi.");
		
	}

}

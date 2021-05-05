package interfaces;

public class CustomerManagger {
	
	private Logger[] loggers; // fazladan loglama iþlemi yapýlsýn diy Legger[] yaptýk.

	public CustomerManagger(Logger[] loggers) {  
		this.loggers = loggers;
	}

	public void add(Customer customer) {
		System.out.println("Müþteri eklendi " + customer.getFirstName());
		

		Utils.runLoggers(loggers, customer.getFirstName());

	}
	
	public void delete(Customer customer) {
		System.out.println("Müþteri silindi. " + customer.getFirstName());
		

		Utils.runLoggers(loggers, customer.getFirstName());
		}
}

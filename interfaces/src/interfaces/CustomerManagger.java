package interfaces;

public class CustomerManagger {
	
	private Logger[] loggers; // fazladan loglama i�lemi yap�ls�n diy Legger[] yapt�k.

	public CustomerManagger(Logger[] loggers) {  
		this.loggers = loggers;
	}

	public void add(Customer customer) {
		System.out.println("M��teri eklendi " + customer.getFirstName());
		

		Utils.runLoggers(loggers, customer.getFirstName());

	}
	
	public void delete(Customer customer) {
		System.out.println("M��teri silindi. " + customer.getFirstName());
		

		Utils.runLoggers(loggers, customer.getFirstName());
		}
}

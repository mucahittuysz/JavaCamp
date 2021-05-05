package interfaces;

public class Main {

	public static void main(String[] args) {
		
		Logger[] loggers = {new SmsLogger(), new EmailLogger() , new DatabaseLogger()};
		
		CustomerManagger customerManager = new CustomerManagger(loggers);
		
		Customer engin = new Customer (1,"Engin","Demiro�");
		customerManager.add(engin);
		

	}

}

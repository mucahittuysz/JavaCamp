package interfaceAbstractDemo;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
	BaseCustomerManager customerManager = new SturbucksCustomerManager(new MernisServiceAdapter());
	customerManager.save(new Customer("51766661110","M�cahit","T�ys�z",LocalDate.of(1996, 9, 2)));
	
System.out.println();

	}

}


//1,"M�cahit","T�ys�z",LocalDate.of(1996, 9, 2),"51766661110"
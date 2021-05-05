package interfaceAbstractDemo;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
	BaseCustomerManager customerManager = new SturbucksCustomerManager(new MernisServiceAdapter());
	customerManager.save(new Customer(1,"Mücahit","Tüysüz",LocalDate.of(1996, 9, 02),"11111111111"));
	
System.out.println();

	}

}

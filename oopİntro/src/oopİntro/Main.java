package oop�ntro;

public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product(1,"Lenovo V14", 15000 , "16 GB RAM",10);    //Referans olu�turma, �rnek olu�turma
		
		
		Product product2 = new Product();    //Referans olu�turma, �rnek olu�turma
	    product2.setId(2);
	    product2.setName("Lenovo V15");
	    product2.setDetail("16 GB Ram");
	    product2.setDiscount(10);
	    product2.setUnitPrice(16000);
	    
	    System.out.println(product2.getUnitPriceAfterDiscount());
	    
	    Category category1 = new Category();
	    category1.setId(1);
	    category1.setName("��ecek");
	    
	    Category category2 = new Category();
	    category1.setId(2);
	    category2.setName("Yiyecek");
	    
	    System.out.println(category1.getName());
	    System.out.println(category2.getName());
		
		
      
      
      
      
      
	
       
	}

}

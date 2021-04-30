package javaProjectExtra;

public class sayýBulma {

	public static void main(String[] args) {
		int[] sayilar = new int[] {1,3,5,7,9,0};
		int aranacak = 8;
		boolean varMi = false;
		
		for (int sayi : sayilar) {
		if(sayi == aranacak) {
	        varMi = true;       
			break;	
		}
		}
       if(varMi) {   // Boolean en son hangi deðerde kýrýldýysa çýktý olarak boolean deðiþkenini yazdýrabiliriz.
    	   System.out.println("Sayý Mevcuttur.");
       }else {
    	   System.out.println("Sayý mevcut deðildir.");
       }
	}

}

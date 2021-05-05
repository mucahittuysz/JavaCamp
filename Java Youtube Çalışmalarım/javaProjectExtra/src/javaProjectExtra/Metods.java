package javaProjectExtra;

public class Metods {

	public static void main(String[] args) {
		
     sayiBulmaca();
	}
	public static void sayiBulmaca () {
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
    	   mesajVer ("Sayý Mevcuttur." + aranacak);
       }else {
    	   mesajVer ("Sayý Mevcut deðildir." + aranacak);
       }
	}
    public static void mesajVer (String mesaj) {
    	System.out.println(mesaj);
}
}

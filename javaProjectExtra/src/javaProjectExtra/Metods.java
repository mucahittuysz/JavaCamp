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
       if(varMi) {   // Boolean en son hangi de�erde k�r�ld�ysa ��kt� olarak boolean de�i�kenini yazd�rabiliriz.
    	   mesajVer ("Say� Mevcuttur." + aranacak);
       }else {
    	   mesajVer ("Say� Mevcut de�ildir." + aranacak);
       }
	}
    public static void mesajVer (String mesaj) {
    	System.out.println(mesaj);
}
}

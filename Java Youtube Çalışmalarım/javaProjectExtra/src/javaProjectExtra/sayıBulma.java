package javaProjectExtra;

public class say�Bulma {

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
       if(varMi) {   // Boolean en son hangi de�erde k�r�ld�ysa ��kt� olarak boolean de�i�kenini yazd�rabiliriz.
    	   System.out.println("Say� Mevcuttur.");
       }else {
    	   System.out.println("Say� mevcut de�ildir.");
       }
	}

}

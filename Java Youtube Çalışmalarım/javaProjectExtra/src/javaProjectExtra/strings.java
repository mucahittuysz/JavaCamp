package javaProjectExtra;

public class strings {

	public static void main(String[] args) {
		
    String mesaj = "      Bug�n hava �ok g�zel.      ";
        System.out.println(mesaj);
        /*  
        System.out.println("Eleman say�s� : " + mesaj.length());
        System.out.println("5. eleman : " +mesaj.charAt(4));
        System.out.println(mesaj.concat(" Ya�as�n!"));
        System.out.println(mesaj.startsWith("B"));
        System.out.println(mesaj.endsWith("."));
        char[] karakterler = new char[5];
        mesaj.getChars(0, 4, karakterler, 0);
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf("a"));
        System.out.println(mesaj.lastIndexOf("a"));// Ba�tan sonra kadar ilk buldu�u belirtilen string ifadeyi bulur. */
		
        String yeniMesaj = mesaj.replace(" ", "-");
		System.out.println(yeniMesaj);
		System.out.println(mesaj.substring(2,5));   //Substring (itibaren) yazd�ran komuttur.
		
		for (String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
		}
		
		System.out.println(mesaj.toLowerCase());   // B�t�n harfleri k���lt�r.
		System.out.println(mesaj.toUpperCase());   // B�t�n harfleri b�y�t�r
		System.out.println(mesaj.trim());    // Ba� ve sondaki bo�luklar� atar
	}

}

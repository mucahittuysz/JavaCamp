package intro;

public class Main {

	public static void main(String[] args) {
	
		
		String internetSubeButonu = "�nternet �ubeye gir";
		double dolarDun = 8.15;
		double dolarBugun = 8.20; 
		
		if (dolarBugun<dolarDun)
		{
			System.out.println("Azalan ��aret");
		}
		else if (dolarBugun>dolarDun)
		{
			System.out.println("Artan i�aret");
		}
		else 
		{
			System.out.println("E�ittir i�areti");
		}
		int vade = 36;
	
		String kredi1 = "H�zl� kredi";
		String kredi2 = "Mutlu emekli kredisi";
		String kredi3 = "Konut kredisi";
		String kredi4 = "�ift�i kredisi";
		String kredi5 = "Msb kredisi";
		String kredi6 = "Meb kredisi";
		String kredi7 = "K�lt�r bakanl��� kredisi";
		
		System.out.println(kredi1);
		System.out.println(kredi2);
		System.out.println(kredi3);
		System.out.println(kredi4);
		System.out.println(kredi5);
		System.out.println(kredi6);
		System.out.println(kredi7);
		
		String[] krediler =
			{
				"H�zl� kredi",
				"Mutlu emekli kredisi",
				"Konut kredisi",
				"�ift�i kredisi",
				"Msb kredisi",
				"Meb kredisi",
				"K�lt�r bakanl��� kredisi"
			};
		for (String kredi : krediler)
		{
			System.out.println(kredi);
		}
		
		for(int i = 0; i<krediler.length;i++)
		{
			System.out.println(krediler[i]);
		}
		
		int sayi1 = 10;
		int sayi2 = 20;
		sayi1 = sayi2;
		sayi2= 100;
		System.out.println(sayi1);
		
		
		int[] sayilar1 = {1,2,3,4,5};
		int[] sayilar2 = {10,20,30,40,50};
		sayilar1 = sayilar2;
		sayilar2[0]=100;
		System.out.println(sayilar1[0]);
		
		
		String sehir1 = "Ankara";
		String sehir2 = "�stanbul";
		sehir1=sehir2;
		sehir2 = "�zmir";
		
		System.out.println(sehir1);
		
		System.out.println(internetSubeButonu);

	}

}

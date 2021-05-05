package javaProjectExtra;

public class miniProje {

	public static void main(String[] args) {
		int number = 9;
		int remainder = number % 2;
		
		boolean isPrime = true;
		
		if (number == 1) {
			System.out.println("Sayý asal deðildir.");
			return;
		}
		
		if (number < 2)
		{
			System.out.println("Geçersiz sayý girdiniz.");
		}
		
		for (int i=2; i<number;i++) {
			if (number % i == 0) {
				isPrime = false;
			}
			
			
		}
		
	if(isPrime == true) {
		System.out.println("Sayý asaldýr.");
	}else 
	{
		System.out.println("Sayý asal deðildir.");
	}
	
	}

}

package staticDemo;

public class ProductValidator {
	static {
		System.out.println("Statik Sistem çalýþtý.");
	}
	public ProductValidator() {
		System.out.println("Sistem çalýþtý.");
	}
	
public static boolean isValid(Product product) {
	if(product.price> 0 && !product.name.isEmpty()) {
		return true;
	}else {
		return false;
	}
}
public void bisey() {
	
}


}

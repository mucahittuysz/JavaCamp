package staticDemo;

public class ProductValidator {
	static {
		System.out.println("Statik Sistem �al��t�.");
	}
	public ProductValidator() {
		System.out.println("Sistem �al��t�.");
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

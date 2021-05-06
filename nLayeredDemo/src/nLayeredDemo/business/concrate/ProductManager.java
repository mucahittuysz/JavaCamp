package nLayeredDemo.business.concrate;

import java.util.List;
import nLayeredDemo.jLogger.JLoggerManager;
import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.core.LoggerService;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.concretes.Product;

public class ProductManager implements ProductService{

	
	private LoggerService logglerService;
	private ProductDao productDao;   // �nterface enjekte etmek.
	public ProductManager(ProductDao productDao, LoggerService loggerService) {
		super();
		this.productDao = productDao;
		this.logglerService = loggerService;
	}

	@Override
	public void add(Product product) {
		if(product.getCotegoryId()==1) {
			System.out.println("Bu kategoride �r�n kabul edilmiyor.");
			return;
		}
		
		this.productDao.add(product);
		this.logglerService.logToSystem("�r�n eklendi.");
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}

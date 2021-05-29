package kodlamaio.northwind.business.concretes;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.core.utilities.result.DataResult;
import kodlamaio.northwind.core.utilities.result.Result;
import kodlamaio.northwind.core.utilities.result.SuccessDateResult;
import kodlamaio.northwind.core.utilities.result.SuccessResult;
import kodlamaio.northwind.datAccess.abstracts.ProductDao;
import kodlamaio.northwind.entites.concretes.Product;

@Service
public class ProductManager implements ProductService{

	
	private ProductDao productDao;
	
	@Autowired
	public ProductManager(ProductDao productDao) {
		this.productDao=productDao;
	}
	
	
	@Override
	public DataResult<List<Product>> getAll() {
		
		return new SuccessDateResult<List<Product>>
		(this.productDao.findAll(),"Data listelendi");
				
	}


	@Override
	public Result add(Product product) {
		this.productDao.save(product);
		return new SuccessResult("Urun eklendi");
	}


	@Override
	public DataResult<Product> getByProductName(String productName) {
		return new SuccessDateResult<Product>
		(this.productDao.getByProductName(productName),"Data listelendi");
	}


	@Override
	public DataResult<Product> getByProductNameAndCategoryId(String productName, int categoryId) {
		//business codes
		
		return new SuccessDateResult<Product>
		(this.productDao.getByProductNameAndCategory_CategoryId(productName,categoryId),"Data listelendi");
	}


	@Override
	public DataResult<List<Product>> getByProductNameOrCategoryId(String productName, int categoryId) {
		return new SuccessDateResult<List<Product>>
		(this.productDao.getByProductNameOrCategory_CategoryId(productName, categoryId),"Data listelendi");
	}


	@Override
	public DataResult<List<Product>> getByCategoryIdIn(List<Integer> categories) {
		return new SuccessDateResult<List<Product>>
		(this.productDao.getByCategoryIdIn(categories),"Data listelendi");
	}


	@Override
	public DataResult<List<Product>> getByProductNameContains(String productName) {
		return new SuccessDateResult<List<Product>>
		(this.productDao.getByProductNameContains(productName),"Data listelendi");
	}


	@Override
	public DataResult<List<Product>> getByProductNameStarsWith(String productName) {
		return new SuccessDateResult<List<Product>>
		(this.productDao.getByProductNameStartsWith(productName),"Data listelendi");
	}
	


	@Override
	public DataResult<List<Product>> getByNameAndCategory(String productName, int categoryId) {
		return new SuccessDateResult<List<Product>>
		(this.productDao.getByNameAndCategory(productName, categoryId),"Data listelendi");
	}


	@Override
	public DataResult<List<Product>> getAll(int pageNo, int pageSize) {
		
		Pageable pagable = PageRequest.of(pageNo, pageSize);
		
		return new SuccessDateResult<List<Product>>(this.productDao.findAll(pagable).getContent());
	}

}

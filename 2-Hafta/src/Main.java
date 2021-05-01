
public class Main {

	public static void main(String[] args) {
		
		Product product1=new Product(1, "Yazilim Gelistirici Yetistirici Kampi(C#+Angular)", "Engin Demirog");
		Product product2=new Product(2, "Yazilim Gelistirici Yetistirici Kampi(Java+React)", "Engin Demirog");
		Product product3=new Product(3, "Proglamamaya Giriþ için Temel Kurs", "Engin Demirog");

		
		Product[] products= {product1,product2, product3};
		
		for(Product product:products) {
			System.out.println(product.courseName);
		};
		
		Category category1=new Category();
		category1.id=1;
		category1.categoryCourseName="Proglmlamaya Giris";
		
		Category category2=new Category();
		category1.id=2;
		category1.categoryCourseName="Yazilim Gelistirme";
		
		ProductManager productManager=new ProductManager();
		productManager.addToLesson(product1);
		productManager.addToLesson(product2);
		productManager.addToLesson(product3);
		
		
		
		
		
		
	}

}

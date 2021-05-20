import business.concretes.CustomerManager;
import entities.concretes.Customer;

public class Main {

	public static void main(String[] args) {
		
		
		CustomerManager customerManager =new CustomerManager();
		Customer customer = new Customer(1, "Talha", "Guller", "talhaguller@gmail.com", "123456");
		customerManager.register(customer);
		
		System.out.println("--------------------------------------");
		
		Customer customer1 = new Customer(2, "Ahmet", "Guller", "ahmetguller@gmail.com", "987654");
		customerManager.register(customer1);
		
	}

}

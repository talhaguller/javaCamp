package business.abstracts;

import java.util.*;
import entities.concretes.Customer;

public interface CustomerService {
	
	void register(Customer customer);
	
	void login(Customer customer);
	
	void logout(Customer customer);
	
	List<Customer> getAll();
	
	
}

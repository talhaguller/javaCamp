package business.concretes;

import java.util.List;

import business.abstracts.CustomerService;
import core.CustomerValidator;
import dataAcsess.abstracts.CustomerDao;
import entities.concretes.Customer;

public class CustomerManager implements CustomerService{

	public CustomerManager() {
		
	}

	private CustomerValidator customerValidator;
	private CustomerDao customerDao;
	private List<Customer> customerList;
	
	
	
	public CustomerManager(CustomerValidator customerValidator, CustomerDao customerDao) {
		this.customerValidator = customerValidator;
		this.customerDao = customerDao;
	}

	@Override
	public void register(Customer customer) {
		if(CustomerValidator.customerCheck(customer.getName() , customer.getLastName())){
			System.out.println("-> Ýsminiz Ve Soyadýnýz Doðrudur ");
			if(CustomerValidator.emailCheck(customer.geteMail())) {
				System.out.println("-> Emailiniz Doðrudur ");
				if(CustomerValidator.passowordCheck(customer.getPassword())) {
					System.out.println("-> Þifreniz Doðrudur ");
					System.out.println("-> " + customer.getName() + " Giriþ Yaptý");
				}else
				System.out.println("-> Lütfen Þifrenizi En Ez Altý Haneli Giriniz ");
			}else
			System.out.println("-> Lütfen Emailinizi Doðru Giriniz ");
		}else
		System.out.println("-> Lütfen Ýsminizi Ve Soyadýnýzý Doðru Giriniz ");
	}

	@Override
	public void login(Customer customer) {
		System.out.println("-> " + customer.getName() + " Giriþ Yaptý");
		
	}

	@Override
	public void logout(Customer customer) {
		System.out.println(customer.getName()+" Çýkýþ Yaptý");
		
	}

	@Override
	public List<Customer> getAll() {
		return customerList;
	}

}

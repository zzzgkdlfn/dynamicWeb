package util;

import java.util.HashMap;
import java.util.Map;

import beans.Customer;

public class CustomerMap {
	
private Map<String, Customer> customers;
	
	public CustomerMap() {
		customers = new HashMap<String, Customer>();
		
		addCustomer(new Customer("id001", "123123", "Alice"));
		addCustomer(new Customer("id002", "456456", "Bob"));
		addCustomer(new Customer("id003", "789789", "Trudy"));
	}

	private void addCustomer(Customer customer) {
		customers.put(customer.getId(), customer);
	}
	
	public Customer findCustomer(String id, String password) {
		Customer customer = null;
		if(id != null) {
			customer = customers.get(id.toLowerCase());
			if(customer == null) return null;
			if(customer.getPassword().equals(password)) return customer;
			else return null;
		}
		else {
			return null;
		}
	}

}

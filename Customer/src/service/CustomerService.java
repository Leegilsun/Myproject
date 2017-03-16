package service;

import java.util.List;

import model.Customer;

public interface CustomerService {
	public boolean idCheck(String id);
	public boolean join(String id, String name, int age, String tel, String addr);
	public boolean delete(String id);
	public List<Customer> getAllCustomer();
}

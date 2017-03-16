package service;

import java.util.List;

import dao.CustomerDao;
import model.Customer;

public class CustomerServiceImpl implements CustomerService{
	CustomerDao dao = new CustomerDao();
	
	@Override
	public boolean idCheck(String id) {
		// TODO Auto-generated method stub
		return dao.selectOneCustomer(id) == null ? true : false;
	}

	@Override
	public boolean join(String id, String name, int age, String tel, String addr) {
		// TODO Auto-generated method stub
		Customer c = new Customer();
		c.setId(id);
		c.setName(name);
		c.setAge(age);
		c.setTel(tel);
		c.setAddr(addr);
		return dao.insertCustomer(c);
	}

	@Override
	public boolean delete(String id) {
		// TODO Auto-generated method stub
		return dao.deleteCustomer(id);
	}

	@Override
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		return dao.selectAllCustomer();
	}

}

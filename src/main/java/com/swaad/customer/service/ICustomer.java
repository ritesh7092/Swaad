package com.swaad.customer.service;

import com.swaad.customer.model.Customer;

public interface ICustomer {
	public boolean registerCustomer(Customer customer);
	public boolean updatePassword(String email, String password);
	public boolean removeCustomer(int userId);
	public Customer isExist(String email, String password);
	
}

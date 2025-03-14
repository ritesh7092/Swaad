package com.swaad.customer.service;

import com.swaad.customer.model.CustomerAddress;

import java.util.List;

public interface CustomerAddressInterface {
	/*
	 entered one address while registering that will be dafault
	 foto address and manager option add addresss, edit , delete , set deafult
	add open new interfae 
	delete remove address with aid 
	edit open interface with filled data and update based on aid
	
	 * */
	public List<CustomerAddress> getAddresses(int userId);
	public boolean updateAddress(CustomerAddress address);
	public boolean removeAddress(int aid);
	public boolean setDefaultAddress(int userId, int aid);
	
}

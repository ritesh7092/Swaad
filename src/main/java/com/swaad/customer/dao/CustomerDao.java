package com.swaad.customer.dao;

import com.swaad.customer.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CustomerDao extends JpaRepository<Customer, Integer>{
	Optional<Customer> findByEmail(String email);
	Optional<Customer> findByEmailAndPassword(String email, String password);
}

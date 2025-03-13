package com.swaad.customer.dao;

import com.swaad.customer.model.CustomerAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerAddressDao extends JpaRepository<CustomerAddress, Integer> {
    List<CustomerAddress> findAllByUserId(int userId);
}

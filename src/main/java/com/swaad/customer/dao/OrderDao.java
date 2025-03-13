package com.swaad.customer.dao;

import com.swaad.customer.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderDao extends JpaRepository<Order, Integer> {
    
    // Method to find a list of orders based on userId
  public  List<Order> findAllByUserId(int userId);
}

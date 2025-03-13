package com.swaad.customer.dao;

import com.swaad.customer.model.CustomerOrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CustomerOrderItemDao extends JpaRepository<CustomerOrderItem,Integer>{

}

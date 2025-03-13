package com.swaad.admin.dao;

import com.swaad.admin.model.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderItemDao extends JpaRepository<OrderItem, Integer> {

    public List<OrderItem> findByRestaurantId(Integer restaurantId);
    public List<OrderItem> findByOrderId(Integer orderId);

}

package com.swaad.customer.dao;

import com.swaad.customer.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartDao extends JpaRepository<Cart, Integer>{
	public List<Cart> findByUserId(Integer userId);
	public Cart findByUserIdAndItemId(Integer userId, Integer itemId);

}

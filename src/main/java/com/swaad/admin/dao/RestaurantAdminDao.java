package com.swaad.admin.dao;

import com.swaad.admin.model.RestaurantAdmin;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;
import java.util.Optional;

public interface RestaurantAdminDao extends JpaRepository<RestaurantAdmin, Integer>{
	List<RestaurantAdmin> findAllByRestaurantId(int restaurantId);
	Optional<RestaurantAdmin> findByRestaurantIdAndEmailAndPassword(int restaurantId, String email, String password);
}

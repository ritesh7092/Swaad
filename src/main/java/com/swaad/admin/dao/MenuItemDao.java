package com.swaad.admin.dao;

import com.swaad.admin.model.RestaurantMenuItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenuItemDao extends JpaRepository<RestaurantMenuItem, Integer>{
	public List<RestaurantMenuItem> findAllByRestaurantId(int restaurantId);
}

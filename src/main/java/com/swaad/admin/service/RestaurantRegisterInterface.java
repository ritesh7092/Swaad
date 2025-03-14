package com.swaad.admin.service;

import com.swaad.admin.model.RestaurantRegister;

public interface RestaurantRegisterInterface {
	public int registerRestaurant(RestaurantRegister restaurant);
	public boolean updateRestaurant(RestaurantRegister restaurant);
	public RestaurantRegister getRestaurant(int restaurantId);
	public int getRestaurantId(String email);
}

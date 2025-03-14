package com.swaad.admin.service;

import com.swaad.admin.model.RestaurantAdmin;

import java.util.List;

public interface RestaurantAdminInterface {
	public boolean addAdmin(RestaurantAdmin admin);
	public boolean updateAdmin(RestaurantAdmin admin);
	public boolean deleteAdmin(int aid);
	public List<RestaurantAdmin> getAdmins(int restaurantId);
	public String authenticateAdmin(int rid, String aEmail, String password);
	
}

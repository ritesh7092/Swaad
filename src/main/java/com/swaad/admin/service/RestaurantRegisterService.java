package com.swaad.admin.service;

import com.swaad.admin.dao.RestaurantRegisterDao;
import com.swaad.admin.model.RestaurantRegister;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RestaurantRegisterService implements RestaurantRegisterInterface {

    @Autowired
    RestaurantRegisterDao restaurantRegisterDao;

    @Override
    public int registerRestaurant(RestaurantRegister restaurant) {
        RestaurantRegister savedRestaurant = restaurantRegisterDao.save(restaurant);
        return savedRestaurant.getRestaurantId();
    }

    @Override
    public boolean updateRestaurant(RestaurantRegister restaurant) {
        if (restaurantRegisterDao.existsById(restaurant.getRestaurantId())) {
            restaurantRegisterDao.save(restaurant);
            
            return true;
        }
        return false;
    }

    @Override
    public RestaurantRegister getRestaurant(int restaurantId) {
        return restaurantRegisterDao.findById(restaurantId).orElse(null);
    }


	@Override
	public int getRestaurantId(String email) {
		// TODO Auto-generated method stub
		int id =  restaurantRegisterDao.findRestaurantIdByEmail(email).get().getRestaurantId();
		return id;
	}
}



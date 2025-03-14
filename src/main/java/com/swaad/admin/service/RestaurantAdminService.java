package com.swaad.admin.service;

import com.swaad.admin.dao.RestaurantAdminDao;
import com.swaad.admin.dao.RestaurantRegisterDao;
import com.swaad.admin.model.RestaurantAdmin;
import com.swaad.utilities.PasswordUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantAdminService implements RestaurantAdminInterface {

    @Autowired
    private RestaurantAdminDao restaurantAdminDao;
    @Autowired
    private RestaurantRegisterDao restaurantRegisterDao; 

    @Override
    public boolean addAdmin(RestaurantAdmin admin) {
        // Encrypt the password before saving
        String hashedPassword = PasswordUtils.hashPassword(admin.getPassword());
        admin.setPassword(hashedPassword);
        RestaurantAdmin savedAdmin = restaurantAdminDao.save(admin);
        return savedAdmin != null;
    }

    @Override
    public boolean updateAdmin(RestaurantAdmin admin) {
        if (restaurantAdminDao.existsById(admin.getAdminId())) {
            RestaurantAdmin existingAdmin = restaurantAdminDao.findById(admin.getAdminId()).orElse(null);
            if (existingAdmin != null) {
                // Encrypt the new password before updating, if provided
                if (admin.getPassword() != null && !admin.getPassword().isEmpty()) {
                    String hashedPassword = PasswordUtils.hashPassword(admin.getPassword());
                    existingAdmin.setPassword(hashedPassword);
                }
                existingAdmin.setEmail(admin.getEmail());
                existingAdmin.setUsername(admin.getUsername());
                restaurantAdminDao.save(existingAdmin);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean deleteAdmin(int aid) {
        if (restaurantAdminDao.existsById(aid)) {
            restaurantAdminDao.deleteById(aid);
            return true;
        }
        return false;
    }

    @Override
    public List<RestaurantAdmin> getAdmins(int restaurantId) {
        return restaurantAdminDao.findAllByRestaurantId(restaurantId);
    }

    @Override
    public String authenticateAdmin(int restaurantId, String aEmail, String password) {

      
        String hashedPassword = PasswordUtils.hashPassword(password);
        
       return restaurantAdminDao
            .findByRestaurantIdAndEmailAndPassword(restaurantId, aEmail, hashedPassword)
            .get().getUsername();
    }
   
}

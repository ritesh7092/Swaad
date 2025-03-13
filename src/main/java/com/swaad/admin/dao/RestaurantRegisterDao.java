package com.swaad.admin.dao;

import com.swaad.admin.model.RestaurantRegister;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RestaurantRegisterDao extends JpaRepository<RestaurantRegister, Integer> {
    Optional<RestaurantRegister> findRestaurantIdByEmail(String email);
}

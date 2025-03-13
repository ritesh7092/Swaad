package com.swaad.admin.dao;


import com.swaad.admin.model.RestaurantOrder;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;


@Repository
public interface RestaurantOrderDao extends JpaRepository<RestaurantOrder, Integer> {

}

package com.swaad.deliveryPartner.dao;

import com.swaad.deliveryPartner.model.DeliveryOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeliveryOrderDao extends JpaRepository<DeliveryOrder, Integer>{
	
	public DeliveryOrder findByOrderId(Integer orderId);

}

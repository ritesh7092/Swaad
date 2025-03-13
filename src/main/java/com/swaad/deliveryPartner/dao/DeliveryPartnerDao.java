package com.swaad.deliveryPartner.dao;

import com.swaad.deliveryPartner.model.DeliveryPartner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DeliveryPartnerDao extends JpaRepository<DeliveryPartner, Integer>{
	public DeliveryPartner findByEmail(String email);
	public DeliveryPartner findByEmailAndPassword(String email, String password);
}

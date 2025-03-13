package com.swaad.customer.dao;

import com.swaad.customer.model.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CouponDao extends JpaRepository<Coupon, Integer>{
	public Coupon findByCode(String code);
}

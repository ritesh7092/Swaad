package com.swaad.customer.dao;

import com.swaad.customer.model.AppliedCoupon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppliedCouponDao extends JpaRepository<AppliedCoupon, Integer>{
	public List<AppliedCoupon> findByUserId(Integer userId);
}

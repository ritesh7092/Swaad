package com.swaad.customer.dao;

import com.swaad.customer.model.AccountPreference;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccountPreferenceDao extends JpaRepository<AccountPreference, Integer>{
	Optional<AccountPreference> findByUserId(int userId);
}

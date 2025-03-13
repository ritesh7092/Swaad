package com.swaad.customer.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "account_preference")
public class AccountPreference {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int preferenceId;
	
	@Column(nullable = false)
	private int userId;
	
	@Column(nullable = false)
	private boolean notificationFlag;
	
	@Column(nullable = false)
	private boolean newsletterFlag;
	
	@Column(nullable = false)
	private boolean promosAndOfferFlag;
	
	@Column(nullable = false)
	private boolean orderStatusFlag;
	
	@Column(nullable = false)
	private int coins;
	              
}

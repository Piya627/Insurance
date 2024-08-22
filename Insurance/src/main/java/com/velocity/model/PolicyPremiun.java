package com.velocity.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="PolicyPremiunm")
public class PolicyPremiun {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long premiunAmt;
	private String premiumType;
	private String premiumStatus;
	public long getPremiunAmt() {
		return premiunAmt;
	}
	public void setPremiunAmt(long premiunAmt) {
		this.premiunAmt = premiunAmt;
	}
	public String getPremiumType() {
		return premiumType;
	}
	public void setPremiumType(String premiumType) {
		this.premiumType = premiumType;
	}
	public String getPremiumStatus() {
		return premiumStatus;
	}
	public void setPremiumStatus(String premiumStatus) {
		this.premiumStatus = premiumStatus;
	}
	
	
	
	
	
	

}

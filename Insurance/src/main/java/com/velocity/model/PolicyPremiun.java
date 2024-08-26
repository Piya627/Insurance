package com.velocity.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Policy_Premiunm")
public class PolicyPremiun {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int premiumid;
	private long premiumamt;
	private String premiumtype;
	private String premiumstatus;
	@ManyToOne
	@JoinColumn(name = "policy_id")
	private Policy policy;

	public int getPremiumid() {
		return premiumid;
	}

	public void setPremiumid(int premiumid) {
		this.premiumid = premiumid;
	}

	public Policy getPolicy() {
		return policy;
	}

	public void setPolicy(Policy policy) {
		this.policy = policy;
	}

	public long getPremiumamt() {
		return premiumamt;
	}

	public void setPremiumamt(long premiumamt) {
		this.premiumamt = premiumamt;
	}

	public String getPremiumtype() {
		return premiumtype;
	}

	public void setPremiumtype(String premiumtype) {
		this.premiumtype = premiumtype;
	}

	public String getPremiumstatus() {
		return premiumstatus;
	}

	public void setPremiumstatus(String premiumstatus) {
		this.premiumstatus = premiumstatus;
	}

	@Override
	public String toString() {
		return "PolicyPremiun [premiumid=" + premiumid + ", premiumamt=" + premiumamt + ", premiumtype=" + premiumtype
				+ ", premiumstatus=" + premiumstatus + ", policy=" + policy + "]";
	}

}

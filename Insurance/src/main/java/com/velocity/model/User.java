package com.velocity.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "User")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;
	private String firstName;
	private String lastName;
	private String email;
	private long mobNo;

	@OneToMany(mappedBy = "userId")
	private List<Policy> policylist;
	
	@OneToMany(mappedBy = "userid")
	private List<PolicyPremiun> policypremiumlist;

	public List<Policy> getPolicylist() {
		return policylist;
	}

	public void setPolicylist(List<Policy> policylist) {
		this.policylist = policylist;
	}

	public List<PolicyPremiun> getPolicypremiumlist() {
		return policypremiumlist;
	}

	public void setPolicypremiumlist(List<PolicyPremiun> policypremiumlist) {
		this.policypremiumlist = policypremiumlist;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getMobNo() {
		return mobNo;
	}

	public void setMobNo(long mobNo) {
		this.mobNo = mobNo;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", mobNo=" + mobNo + ", policylist=" + policylist + ", policypremiumlist=" + policypremiumlist + "]";
	}

}

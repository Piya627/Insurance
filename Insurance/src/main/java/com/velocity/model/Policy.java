package com.velocity.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Policy")
public class Policy {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int policySrno;
	private int policyId;
	private String policyName;
	private String policyStatus;
	private String poicyCoverage;
	private double policyTerm;
	
	private Integer userid;
	
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public int getPolicySrno() {
		return policySrno;
	}
	public void setPolicySrno(int policySrno) {
		this.policySrno = policySrno;
	}
	public int getPolicyId() {
		return policyId;
	}
	public void setPolicyId(int policyId) {
		this.policyId = policyId;
	}
	public String getPolicyName() {
		return policyName;
	}
	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}
	public String getPolicyStatus() {
		return policyStatus;
	}
	public void setPolicyStatus(String policyStatus) {
		this.policyStatus = policyStatus;
	}
	public String getPoicyCoverage() {
		return poicyCoverage;
	}
	public void setPoicyCoverage(String poicyCoverage) {
		this.poicyCoverage = poicyCoverage;
	}
	public double getPolicyTerm() {
		return policyTerm;
	}
	public void setPolicyTerm(double policyTerm) {
		this.policyTerm = policyTerm;
	}
	@Override
	public String toString() {
		return "Policy [policySrno=" + policySrno + ", policyId=" + policyId + ", policyName=" + policyName
				+ ", policyStatus=" + policyStatus + ", poicyCoverage=" + poicyCoverage + ", policyTerm=" + policyTerm
				+ ", userid=" + userid + "]";
	}
	
	
	

}

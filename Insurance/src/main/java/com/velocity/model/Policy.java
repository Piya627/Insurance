package com.velocity.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Policy")
public class Policy {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int policyid;
	private int policysrno;
	private String policyname;
	private String policystatus;
	private String policycoverage;
	private double policyterm;
	@ManyToOne
    @JoinColumn(name = "user_id")
	private User user;

	@OneToMany(cascade = CascadeType.ALL,mappedBy = "policy")
	private List<PolicyPremiun> policypremiumlist;

	public int getPolicysrno() {
		return policysrno;
	}

	public void setPolicysrno(int policysrno) {
		this.policysrno = policysrno;
	}

	public int getPolicyid() {
		return policyid;
	}

	public void setPolicyid(int policyid) {
		this.policyid = policyid;
	}

	public String getPolicyname() {
		return policyname;
	}

	public void setPolicyname(String policyname) {
		this.policyname = policyname;
	}

	public String getPolicystatus() {
		return policystatus;
	}

	public void setPolicystatus(String policystatus) {
		this.policystatus = policystatus;
	}

	public String getPolicycoverage() {
		return policycoverage;
	}

	public void setPolicycoverage(String policycoverage) {
		this.policycoverage = policycoverage;
	}

	public double getPolicyterm() {
		return policyterm;
	}

	public void setPolicyterm(double policyterm) {
		this.policyterm = policyterm;
	}

	

	

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<PolicyPremiun> getPolicypremiumlist() {
		return policypremiumlist;
	}

	public void setPolicypremiumlist(List<PolicyPremiun> policypremiumlist) {
		this.policypremiumlist = policypremiumlist;
	}

	@Override
	public String toString() {
		return "Policy [policyid=" + policyid + ", policysrno=" + policysrno + ", policyname=" + policyname
				+ ", policystatus=" + policystatus + ", policycoverage=" + policycoverage + ", policyterm=" + policyterm
				+ ", user=" + user + ", policypremiumlist=" + policypremiumlist + "]";
	}
	

}

package com.velocity.model;


	import jakarta.persistence.Entity;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.GenerationType;
	import jakarta.persistence.Id;

	@Entity
	public class Driver {
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int id;
		private String name;
		private String license;
		private String mobileNum;
		private String city;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getLicense() {
			return license;
		}
		public void setLicense(String license) {
			this.license = license;
		}
		public String getMobileNum() {
			return mobileNum;
		}
		public void setMobileNum(String mobileNum) {
			this.mobileNum = mobileNum;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		@Override
		public String toString() {
			return "Driver [id=" + id + ", name=" + name + ", license=" + license + ", mobileNum=" + mobileNum + ", city="
					+ city + "]";
		}
		
		
		

	}



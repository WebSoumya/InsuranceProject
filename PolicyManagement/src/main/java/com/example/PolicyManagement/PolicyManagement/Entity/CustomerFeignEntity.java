package com.example.PolicyManagement.PolicyManagement.Entity;



public class CustomerFeignEntity {
	
	
	private long customerid;
    
    private String firstname; 
	
    private String lastname;
	
	
    private String email;

	public long getCustomerid() {
		return customerid;
	}

	public void setCustomerid(long customerid) {
		this.customerid = customerid;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "CustomerEntity [customerid=" + customerid + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", email=" + email + "]";
	}
}

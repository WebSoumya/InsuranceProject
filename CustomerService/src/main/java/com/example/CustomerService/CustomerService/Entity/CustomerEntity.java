package com.example.CustomerService.CustomerService.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CustomerEntity {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long customerid;
    
	@Column
    private String firstname; 
	
	@Column
    private String lastname;
	
	@Column
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
	
//	@Column
//    private String password; 
	
	
	
	
}

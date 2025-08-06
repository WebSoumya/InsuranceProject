package com.example.PolicyManagement.PolicyManagement.Entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity		
public class PolicyEntity {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Policyid;
    
	@Column
    private int customerid;
    
	@Column
    private int productid;
    
	@Column
    private LocalDate startdate;
    
	@Column
    private LocalDate enddate;
    
	@Column
    private String Status;
    
	@Column
    private long amount;

	public long getPolicyid() {
		return Policyid;
	}

	public void setPolicyid(long policyid) {
		Policyid = policyid;
	}

	public int getCustomerid() {
		return customerid;
	}

	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}

	public int getProductid() {
		return productid;
	}

	public void setProductid(int productid) {
		this.productid = productid;
	}

	public LocalDate getStartdate() {
		return startdate;
	}

	public void setStartdate(LocalDate startdate) {
		this.startdate = startdate;
	}

	public LocalDate getEnddate() {
		return enddate;
	}

	public void setEnddate(LocalDate enddate) {
		this.enddate = enddate;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "PolicyEntity [Policyid=" + Policyid + ", customerid=" + customerid + ", productid=" + productid
				+ ", startdate=" + startdate + ", enddate=" + enddate + ", Status=" + Status + ", amount=" + amount
				+ "]";
	}
    
    
    
    
    
}

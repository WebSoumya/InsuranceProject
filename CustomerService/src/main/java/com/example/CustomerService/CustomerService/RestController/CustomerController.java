package com.example.CustomerService.CustomerService.RestController;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.CustomerService.CustomerService.CustomerServiceImplementation.CustomerService;
import com.example.CustomerService.CustomerService.Entity.CustomerEntity;


@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService cservice;


	@PostMapping("/customer")
	public ResponseEntity<CustomerEntity> createuser(@RequestBody CustomerEntity customer)
	{
		cservice.createuser(customer);
		 return new ResponseEntity<CustomerEntity>(customer,HttpStatus.OK);
	}
	
	@GetMapping("/customer/{customerid}")
	public Optional<CustomerEntity> getcustomerbyid(@PathVariable long customerid)
	{
		Optional<CustomerEntity> customer = cservice.getuserbyid(customerid);
		 return customer;
	}
	
	@DeleteMapping("deletecustomer/{customerid}")
	public void Deletepolicy(@PathVariable long customerid)
	{
		cservice.deleteuser(customerid);
	}
}

package com.example.PolicyManagement.PolicyManagement.RestServices;

import java.util.Optional;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.PolicyManagement.PolicyManagement.Entity.CustomerFeignEntity;


@FeignClient(name="CustomerService", url = "http://localhost:8081")
public interface CustomerFeignRestAPI {

	@GetMapping("/customer/{customerid}")
	public Optional<CustomerFeignEntity> getcustomerbyid(@PathVariable long customerid);
}

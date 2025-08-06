package com.example.PolicyManagement.PolicyManagement.RestServices;

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

import com.example.PolicyManagement.PolicyManagement.Entity.PolicyEntity;
import com.example.PolicyManagement.PolicyManagement.Service.PolicyService;

@RestController
public class PolicyRestController {

	@Autowired
	private PolicyService pservice;
	
	@PostMapping("/Policies")
	public ResponseEntity<PolicyEntity> createpolicy(@RequestBody PolicyEntity pol)
	{
		if(pservice.iscustomerexists(pol.getCustomerid()))
		{
			pservice.createpolicy(pol);
			 return new ResponseEntity<PolicyEntity>(pol,HttpStatus.OK);
		}
		
		else
		{
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		
	}
	
	@GetMapping("/Policy/{policyid}")
	public Optional<PolicyEntity> getpolicybyid(@PathVariable long policyid)
	{
		Optional<PolicyEntity> policy = pservice.getpolicy(policyid);
		 return policy;
	}
	
	@DeleteMapping("deletepolicy/{policyid}")
	public void Deletepolicy(@PathVariable long policyid)
	{
		pservice.deletepolicy(policyid);
	}
	
	
}

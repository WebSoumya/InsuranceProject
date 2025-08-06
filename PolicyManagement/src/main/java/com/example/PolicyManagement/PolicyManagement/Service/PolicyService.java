package com.example.PolicyManagement.PolicyManagement.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.PolicyManagement.PolicyManagement.DAO.PolicyDAO;
import com.example.PolicyManagement.PolicyManagement.Entity.CustomerFeignEntity;
import com.example.PolicyManagement.PolicyManagement.Entity.PolicyEntity;
import com.example.PolicyManagement.PolicyManagement.RestServices.CustomerFeignRestAPI;



@Service
public class PolicyService {
	
	@Autowired
	private PolicyDAO pdao;
	
	@Autowired
	private CustomerFeignRestAPI customerfeign;

	   public PolicyEntity createpolicy(PolicyEntity policy)
	   {
		   pdao.save(policy);
		   return policy;
	   }
	   
	   public Optional<PolicyEntity> getpolicy(long id)
	   {
		   Optional<PolicyEntity> pol = pdao.findById(id);
		   return pol;
	   }
	   
	   public void deletepolicy(long id)
	   {
		   pdao.deleteById(id);
	   }
	   
	   public boolean iscustomerexists(long id)
	   {
		   try {
			   
			   Optional<CustomerFeignEntity> customer = customerfeign.getcustomerbyid(id);
			   System.out.println(customer);
			   return customer.isPresent();
			   
		   }
		   catch(Exception e)
		   {
			   System.out.println(e.getMessage());
			   return false;
		   }
	   }
}

package com.example.CustomerService.CustomerService.CustomerServiceImplementation;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.CustomerService.CustomerService.DAO.CustomerDAO;
import com.example.CustomerService.CustomerService.Entity.CustomerEntity;

@Service
public class CustomerService {

	@Autowired
	private CustomerDAO cdao;

	   public CustomerEntity createuser(CustomerEntity policy)
	   {
		   cdao.save(policy);
		   return policy;
	   }
	   
	   public Optional<CustomerEntity> getuserbyid(long id)
	   {
		   Optional<CustomerEntity> customer = cdao.findById(id);
		   return customer;
	   }
	   
	   public void deleteuser(long id)
	   {
		   cdao.deleteById(id);
	   }
}

package com.example.CustomerService.CustomerService.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.CustomerService.CustomerService.Entity.CustomerEntity;

@Repository
public interface CustomerDAO extends JpaRepository<CustomerEntity, Long> {

}

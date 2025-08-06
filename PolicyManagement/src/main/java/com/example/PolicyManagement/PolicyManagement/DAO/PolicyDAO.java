package com.example.PolicyManagement.PolicyManagement.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.PolicyManagement.PolicyManagement.Entity.PolicyEntity;

@Repository	
public interface PolicyDAO extends JpaRepository<PolicyEntity, Long> {

}

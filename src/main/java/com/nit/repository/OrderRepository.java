package com.nit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.nit.entity.OrderEntity;


 @Repository
public interface OrderRepository extends JpaRepository<OrderEntity,String> {

	//List<OrderEntity> findByEmailAndOrderstatus(String email, String orderstatus);

	//List<OrderEntity> findByCityOrAmount(String city, double amount);

	//List<OrderEntity> findByEmail(String email);

	List<OrderEntity> findByEmailOrOrderstatus(String email, String orderstatus);
	
    // List<OrderEntity> findEmailAndOrderstatus(String email, String orderstatus);


}

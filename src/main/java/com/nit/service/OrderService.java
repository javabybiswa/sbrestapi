package com.nit.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.entity.OrderEntity;
import com.nit.repository.OrderRepository;
import com.nit.request.OrderRequest;
import com.nit.response.OrderResponse;

@Service
public class OrderService {

	  
	  @Autowired
	  OrderRepository repository;
	  
	  public String addOrderDetails(OrderRequest request) {
		  
		  OrderEntity order=new OrderEntity();
		  
		      order.setOrderid(request.getOrderid());
		      order.setOrderstatus(request.getOrderstatus());
		      order.setEmail(request.getEmail());
		      order.setCity(request.getCity());
		      order.setAmount(request.getAmount());
		      
		       repository.save(order);
		      return "order inserted successfully";
				  
		  
	  }

	   
	   
	    /* public List<OrderResponse>getOrderByemailAndstatus(String email,String orderstatus){
	    	 
	    	 List<OrderEntity> orders=repository.findEmailAndOrderstatus(email,orderstatus);
	    	 
	    	  List<OrderResponse> allOrders=orders.stream().map(v-> new OrderResponse(v.getOrderid(),v.getOrderstatus(),v.getAmount(),v.getEmail(),v.getEmail())).collect(Collectors.toList());
	    	  
	    	    return allOrders;
	     }*/
	  
	     //get user details by email and orderstatus
	     
	/*  public List<OrderResponse> getUserDetailsByEmailAndOrderstatus(String email,String orderstatus) {
	    	List<OrderEntity> orders=repository.findByEmailAndOrderstatus(email,orderstatus);
	    	 List<OrderResponse> allOrders=orders.stream().map(v-> new OrderResponse(v.getOrderid(),v.getOrderstatus(),v.getAmount(),v.getEmail(),v.getEmail())).collect(Collectors.toList());
	    	  
	    	    return allOrders;
	    	     }*/
	  
     //get user details based on email id
	  
	   /*public List<OrderResponse> getOrderDetailsByEmail(String email) {
		  List<OrderEntity> orders=repository.findByEmail(email);
		  List<OrderResponse> allOrders=orders.stream().map(v-> new OrderResponse(v.getOrderid(),v.getOrderstatus(),v.getAmount(),v.getEmail(),v.getEmail())).collect(Collectors.toList());
    	  return allOrders;		
	}*/
	    //get  user details by using either email or orderstatus


		public List<OrderResponse> getOrderDetailsByEmailOrOrderstatus(String email, String orderstatus) {
			  List<OrderEntity> orders=repository.findByEmailOrOrderstatus(email,orderstatus);
			  List<OrderResponse> allOrders=orders.stream().map(v-> new OrderResponse(v.getOrderid(),v.getOrderstatus(),v.getAmount(),v.getEmail(),v.getEmail())).collect(Collectors.toList());
	    	  return allOrders;		
		}
		  
	}

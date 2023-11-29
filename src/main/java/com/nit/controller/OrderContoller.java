package com.nit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nit.request.OrderRequest;
import com.nit.response.OrderResponse;
import com.nit.service.OrderService;

@RestController
 @RequestMapping("/user")
public class OrderContoller {

	   @Autowired
	   OrderService orderService;
	   
	   @PostMapping("/register")
	   public String addOrder(@RequestBody OrderRequest request) {
		   
		   
		   String response=orderService.addOrderDetails(request);
		   
		   return response;
	   }
	     
	   
	    //getting details from emailid
	   
	     /*  @GetMapping("/emailid/{email}/status/{status}")
	       public List<OrderResponse> getOrderByemailAndstatus(@PathVariable("emailid") String email,@PathVariable("status") String orderstatus){
	    	   
	    	    List<OrderResponse> orders=orderService.getOrderByemailAndstatus(email, orderstatus);
	    	     return orders;
	       }*/
	   
	   //getting details from email and orderstatus
	    /*@RequestMapping(value="/get/{email}/status/{orderstatus}",method=RequestMethod.GET)
	     public List<OrderResponse> getUserDetailsByEmailAndOrderstatus(@PathVariable("email")String email,@PathVariable("orderstatus")String orderstatus) {
	    	 
	    	 List<OrderResponse> orders=orderService.getUserDetailsByEmailAndOrderstatus(email, orderstatus);
	    	 
	    	 return orders;
	     }*/
	    
	              //get user details based on email with @RequestParam
	     /*  @GetMapping("/details")
	       public List<OrderResponse> getUserDetails(@RequestParam String email) {
	    	   
	    	    List<OrderResponse> response=orderService.getOrderDetailsByEmail(email);
	    	       return response;
	       }*/
	   
	           //get user details based on email or orderstatus
	   
	          @GetMapping("/userdetails")
	            public List<OrderResponse> getOrderDetailsByEmailOrOrderstatus(@RequestParam String email,@RequestParam String orderstatus){
	                  List<OrderResponse> response=orderService.getOrderDetailsByEmailOrOrderstatus(email,orderstatus);
	                    return response;
	          }
}
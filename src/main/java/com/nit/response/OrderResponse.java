package com.nit.response;

public class OrderResponse {
	 
	 private String orderid;
	 private String orderstatus;
	 private double amount;
	 private String email;
	 private String city;
	public OrderResponse() {
		
	}
	public OrderResponse(String orderid, String orderstatus, double amount, String email, String city) {
		super();
		this.orderid = orderid;
		this.orderstatus = orderstatus;
		this.amount = amount;
		this.email = email;
		this.city = city;
	}
	public String getOrderid() {
		return orderid;
	}
	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}
	public String getOrderstatus() {
		return orderstatus;
	}
	public void setOrderstatus(String orderstatus) {
		this.orderstatus = orderstatus;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "OrderResponse [orderid=" + orderid + ", orderstatus=" + orderstatus + ", amount=" + amount + ", email="
				+ email + ", city=" + city + "]";
	}
	 
	 

}

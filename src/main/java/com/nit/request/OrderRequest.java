package com.nit.request;

public class OrderRequest {
	
	 private String orderid;
	 private String Orderstatus;
	 private String email;
	 private double amount;
	 private String city;
	public String getOrderid() {
		return orderid;
	}
	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}
	public String getOrderstatus() {
		return Orderstatus;
	}
	public void setOrderstatus(String orderstatus) {
		Orderstatus = orderstatus;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public OrderRequest(String orderid, String orderstatus, String email, double amount, String city) {
		super();
		this.orderid = orderid;
		Orderstatus = orderstatus;
		this.email = email;
		this.amount = amount;
		this.city = city;
	}
	public OrderRequest() {
		
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "OrderRequest [orderid=" + orderid + ", Orderstatus=" + Orderstatus + ", email=" + email + ", amount="
				+ amount + ", city=" + city + "]";
	}
	
	
	 
	 
	
}

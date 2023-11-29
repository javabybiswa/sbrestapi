package com.nit.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="home_order")
public class OrderEntity {
	
	@Id
	@Column
	private String orderid;
	
	@Column
	private String orderstatus;
	
	@Column
	private double amount;
	
	@Column
	private String email;
	
	@Column
	private String city;

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
		return "OrderEntity [orderid=" + orderid + ", orderstatus=" + orderstatus + ", amount=" + amount + ", email="
				+ email + ", city=" + city + "]";
	}

	
	
}

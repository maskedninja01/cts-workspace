package com.cts.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToOne;

@Entity
public class Order extends Transaction {

	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long orderId;
	private double amount;
	@OneToOne
	private Cart cart;

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public Order(Cart cart) {
		this.cart = cart;
	}

}

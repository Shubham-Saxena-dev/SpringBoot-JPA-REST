package com.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.springframework.stereotype.Component;

@Entity
@Component
@Table(name = "tblItems", uniqueConstraints = { @UniqueConstraint(columnNames = "ITEM_ID") })
public class Items {

	@Id
	@Column(name = "ITEM_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int itemId;

	@Column(name = "ITEM_NAME")
	private String itemName;

	@ManyToOne
	private Cart cart;

	@Column(name = "COST")
	private int itemCost;
	
	public Items() {
	}

	public Items(String itemName, Cart cart, int itemCost) {
		this.itemName = itemName;
		this.cart = cart;
		this.itemCost = itemCost;
	}
	
	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public int getItemCost() {
		return itemCost;
	}

	public void setItemCost(int itemCost) {
		this.itemCost = itemCost;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

}

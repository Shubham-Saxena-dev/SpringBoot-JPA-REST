package com.spring.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.springframework.stereotype.Component;

@Entity
@Component
@Table(name = "tblAccount", uniqueConstraints = { @UniqueConstraint(columnNames = "USER_ID") })
public class User {

	public static final String queryName = "GET_ACCOUNT";

	@Column(name = "USER_ID", insertable = true, updatable = false, unique = true)
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;

	@OneToOne(cascade = CascadeType.ALL)
	private Cart cart;

	public User() {
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

}

package com.spring.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.ShoppingRepository;
import com.spring.model.Cart;
import com.spring.model.Items;
import com.spring.model.User;

@Service
public class SpringHibernateService {

	Map<User, Cart> map = new HashMap<User, Cart>();

	@Autowired
	User user;
	@Autowired
	Cart cart;
	
	@Autowired
	ShoppingRepository repo;
	
	/*@Autowired
	CustomJPARepsitory repo2;*/

	public Cart createCartForUser() {
		/*cart.setItems(this.createItems());
		cart.setUser(user);
		user.setCart(cart);
		repo.save(user);*/
		return cart;
	}

	private List<Items> createItems() {
		List<Items> item = new ArrayList<Items>();
		item.add(new Items("Item1", cart, 1000));
		item.add(new Items("Item2", cart, 2000));
		item.add(new Items("Item3", cart, 3000));
		return item;
	}

	public List<Items> getItemBasedOnAmount(int amt) {
		return repo.getItemBasedOnAmount(amt);
	}

}

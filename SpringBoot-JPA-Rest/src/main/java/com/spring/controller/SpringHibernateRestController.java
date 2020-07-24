package com.spring.controller;

import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.model.Cart;
import com.spring.service.SpringHibernateService;

@RestController
public class SpringHibernateRestController {

	@Autowired
	SpringHibernateService service;
	
	@GetMapping("/checking")
	public ResponseEntity<Cart> createShoppingCart() {
		return new ResponseEntity<Cart>(service.createCartForUser(), HttpStatus.NO_CONTENT);

	}
	
	@GetMapping("/checking/{amt}")
	public @ResponseBody ResponseEntity<Object> getShoppingItem(@PathVariable("amt") int amt) throws JSONException {
		if(amt<2000) {
		/*    List<JSONObject> entities = new ArrayList<JSONObject>();
			 for (Items item : service.getItemBasedOnAmount(amt)) {
			        JSONObject entity = new JSONObject();
			        entity.put("item_id", item.getItemId());
			        entity.put("cost",item.getItemCost());
			        entity.put("item_name", item.getItemName());
			        entity.put("cart_id", item.getCart().getCartId());
			        entities.add(entity);
			    }*/
			 return new ResponseEntity<>(service.getItemBasedOnAmount(amt), HttpStatus.OK);

			//return new ResponseEntity<Object>(entities, HttpStatus.OK);
		}
		return new ResponseEntity<Object>(HttpStatus.NOT_FOUND);

	}
	
}

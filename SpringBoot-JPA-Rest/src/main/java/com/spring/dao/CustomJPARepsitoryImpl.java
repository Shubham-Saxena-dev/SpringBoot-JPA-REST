package com.spring.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.transaction.annotation.Transactional;

import com.spring.model.Items;

@Transactional
public class CustomJPARepsitoryImpl implements CustomJPARepsitory {

	@PersistenceContext
    EntityManager entityManager;
	
	@Override
	public List<Items> getItemBasedOnAmount(int amt) {
		Query query = entityManager.createNativeQuery("select * from tblItems where cost = :cost");
		query.setParameter("cost", amt);
		return query.getResultList();
	}


}

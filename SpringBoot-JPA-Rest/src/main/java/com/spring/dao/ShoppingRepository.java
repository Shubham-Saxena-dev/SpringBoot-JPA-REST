package com.spring.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.model.Items;

@Repository
public interface ShoppingRepository extends JpaRepository<Items, Integer>,CustomJPARepsitory {

}

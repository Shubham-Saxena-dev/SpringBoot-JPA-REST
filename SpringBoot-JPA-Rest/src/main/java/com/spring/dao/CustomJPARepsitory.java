package com.spring.dao;

import java.util.List;

import com.spring.model.Items;

public interface CustomJPARepsitory{

	public List<Items> getItemBasedOnAmount(int amt);

}

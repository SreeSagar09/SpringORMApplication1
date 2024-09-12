package com.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDAOImpl implements ProductDAO{
	
	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	public List<Product> getAllProducts() {
		List<Product> productList = hibernateTemplate.findByExample(new Product());
		return productList;
	}

}

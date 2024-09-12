package com.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductDetails {
	@Autowired
	private ProductDAO productDAO;
	
	public List<Product> getAllProductDetails(){
		List<Product> productList = productDAO.getAllProducts();
		return productList;
	}
}

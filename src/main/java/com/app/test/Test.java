package com.app.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.Product;
import com.app.ProductDetails;

public class Test {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Config.xml");
		String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
		
		System.out.println("----------- All Bean Names -----------");
		for(String beanName : beanDefinitionNames) {
			System.out.println(beanName);
		}
		
		ProductDetails productDetails = applicationContext.getBean(ProductDetails.class);
		List<Product> productList = productDetails.getAllProductDetails();
		
		System.out.println("--------- All Product List --------");
		productList.forEach(p->{System.out.println(p);});
	}
}

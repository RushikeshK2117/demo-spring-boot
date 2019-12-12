package com.priyankan.demo.spring.boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rushikeshk.demo.spring.boot.model.ProductObject;

@RestController
public class ProductController {

	@GetMapping("/product")
	public ProductObject getProduct() {
	
		ProductObject product = new ProductObject();
		return product;
	}
}

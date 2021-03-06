package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.pojo.Product;
import com.demo.service.ProductService;



@RestController
public class ProductController {
	@Autowired
	private ProductService productService;
	
	@RequestMapping(method=RequestMethod.DELETE, value="/subjects/{id}")
	public void DeleteProduct(@PathVariable int id) {
		productService.deleteProduct(id);
	}
	
}


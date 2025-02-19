package com.example.SpringJDBCDemo1.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.data.domain.Page; 
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import com.example.SpringJDBCDemo1.Entity.*;
import com.example.SpringJDBCDemo1.Service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	
	@Autowired
	private ProductService productService;
	
	@GetMapping
	public Page<Product> getProducts(@RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "5") int size)
	{
		return productService.getAllProducts(page, size);
	}
	
	

}

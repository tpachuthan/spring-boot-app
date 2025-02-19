package com.example.SpringJDBCDemo1.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.SpringJDBCDemo1.Entity.Product;
import com.example.SpringJDBCDemo1.Repository.ProductRepo;


@Service
public class ProductService {
	@Autowired
	private ProductRepo productRepo;
	
	public Page<Product> getAllProducts(int page,int size)	
	{
		Pageable pageable = (Pageable) PageRequest.of(page,size);
		return productRepo.findAll(pageable);
	}     
	
	
	
	

}

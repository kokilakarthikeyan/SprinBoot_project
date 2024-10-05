	package com.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController

public class ProductController {
	
	@Autowired
	private ProductService Prodservice;
	
	@Autowired
	private ProductRepository Prodrepo;
	
	@PostMapping("/saveProd")
	public ProductEntity createproduct(@RequestBody ProductPojo Prodpojo) {
	ProductEntity prodentity=new ProductEntity();
     //empentity.setEmp_id(Empojo.getEmp_id());
	prodentity.setName(Prodpojo.getName());
	prodentity.setPrice(Prodpojo.getPrice());
	prodentity.setDate(Prodpojo.getDate());
	prodentity.setCountry(Prodpojo.getCountry());
	
	ProductEntity prodname=Prodservice.save(prodentity);
	//return new ProductEntity<>(prodname, HttpStatus.CREATED);
	return prodname;
	
	
	
	
	
		
		
	}
	

}

package com.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public  class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductRepository Prodrepo;

	@Override
	public ProductEntity save(ProductEntity prodentity) {
		ProductEntity name=new ProductEntity();
		name=Prodrepo.save(prodentity);
		return name;
	}

}

package com.tracxe.dao;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tracxe.model.Product;

@Service
public class ProductDAO {
	
	@Autowired
	private ProductRepository prodRepo;
	
	public List<Product> getAllProducts()
	{
		return prodRepo.findAll();
	}
	
	public Product getProductById(int id)
	{
		return prodRepo.findById(id).orElse(new Product());
	}
	
    public Product getProductByName(String name)
    {
    	return prodRepo.findByName(name).orElse(new Product());
    }
    
    public Product registerProduct(Product product)
    {
    	return prodRepo.save(product);
    }
    
    public Product updateProduct(Product product)
    {
    	return prodRepo.save(product);
    }
    
    public String deleteProductById(int id)
    {
    	prodRepo.deleteById(id);
    	return "Product with id " + id + " is deleted";	
    }
}

package com.tracxe.empdept;
import com.tracxe.dao.ProductDAO;
import com.tracxe.model.Product;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
public class ProductController {
	
	@Autowired
	private ProductDAO prodDAO;
 
   @RequestMapping("/product")
   public Product showProduct()
   {
	   return new Product(101, "Mouse", 219.00);
   }
   
   @RequestMapping("/getProducts")
   public ArrayList<Product> getProducts()
   {
	   ArrayList<Product> product = new ArrayList<Product>();
	   Product p1 = new Product(102, "Keyboard", 450.00);
	   Product p2 = new Product(103, "Laptop", 25000.00);
	   product.add(p1);
	   product.add(p2);
	   return product;
   }
   
    @RequestMapping("/getAllProducts")
    public List<Product> getAllProducts()
    {
    	return prodDAO.getAllProducts();
    }
    
    @RequestMapping("/getProductById/{ID}")
    public Product getProductById(@PathVariable("ID")int id)
    {
    	return prodDAO.getProductById(id);
    }
    
    @RequestMapping("/findByName/{PRODUCTNAME}")
    public Product getProductByName(@PathVariable("PRODUCTNAME")String name)
    {
    	return prodDAO.getProductByName(name);
    }
    
    @PostMapping("/registerProduct")
    public Product registerProduct(@RequestBody Product product)
    {
    	return prodDAO.registerProduct(product);
    }
    
    @PutMapping("/updateProduct")
    public Product updateProduct(@RequestBody Product product)
    {
    	return prodDAO.updateProduct(product);
    }
    
    @DeleteMapping("/deleteProductById/{ID}")
    public String deleteProductById(@PathVariable("ID")int id)
    {
    	return prodDAO.deleteProductById(id);
    }
    

}
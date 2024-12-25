package com.tracxe.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// the class to represent a e-commerce product
@Entity
public class Product {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
      private int id;
      private String productName;
      private double price;
      
      public Product()
      {
    	  
      }
      
	  public Product(int id, String name, double price)
	  {
		 this.id = id;
		 this.productName = name;
		 this.price = price;
	  }

      public int getId() 
	  {
		 return id;
	  }
	  
	  public void setId(int id) 
	  {
		 this.id = id;
	  }
	  
	  public String getProductName() 
	  {
		 return productName;
	  }
	  
	  public void setProductName(String name)
	  {
		 this.productName = name;
	  }
	  
	  public double getPrice()
	  {
		 return price;
	  }
	  
	  public void setPrice(double price)
	  {
		 this.price = price;
	  }

	 @Override
	 public String toString()
	 {
		return "Product [id=" + id + ", name=" + productName + ", price=" + price + "]";
	 }
      
	  
	  
      
}

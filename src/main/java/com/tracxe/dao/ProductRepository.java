package com.tracxe.dao;

import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.tracxe.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    @Query("from Product p where p.productName = :name")  
	Optional<Product> findByName(@Param("name") String name);
}



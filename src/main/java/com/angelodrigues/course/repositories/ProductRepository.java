package com.angelodrigues.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.angelodrigues.course.entities.Product;

public interface ProductRepository  extends JpaRepository<Product,Long>{     
    
}
package com.angelodrigues.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.angelodrigues.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order,Long>{    
}

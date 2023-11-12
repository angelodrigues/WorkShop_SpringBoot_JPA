package com.angelodrigues.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.angelodrigues.course.entities.User;

public interface UserRepository extends JpaRepository<User,Long>{
}
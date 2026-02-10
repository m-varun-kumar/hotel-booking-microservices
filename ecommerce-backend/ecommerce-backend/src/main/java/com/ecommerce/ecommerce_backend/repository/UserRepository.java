package com.ecommerce.ecommerce_backend.repository;


import com.ecommerce.ecommerce_backend.model.AppUser;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<AppUser, Long> {
}

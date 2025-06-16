package com.example.demo.Repository;

import com.example.demo.Entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProducttRepository extends JpaRepository<ProductEntity, Long> {
}

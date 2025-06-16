package com.example.demo.Service;

import com.example.demo.Entity.ProductEntity;
import com.example.demo.Repository.ProducttRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProducttRepository producttRepository;

    public List<ProductEntity> findAll(){
        return producttRepository.findAll();
    }

    public Optional<ProductEntity> findById(Long id){
        return producttRepository.findById(id);
    }

    public void save(ProductEntity productEntity){
        producttRepository.save(productEntity);
    }


}

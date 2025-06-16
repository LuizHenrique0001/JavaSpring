package com.example.demo.Controller;

import com.example.demo.Entity.CategoryEntity;
import com.example.demo.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public ResponseEntity<List<CategoryEntity>> findAll(){
        return ResponseEntity.ok().body(categoryService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<CategoryEntity>> findById(@PathVariable Long id){
        return ResponseEntity.ok().body(categoryService.findById(id));
    }
    @PostMapping
    public void save(CategoryEntity categoryEntity){
        categoryService.save(categoryEntity);
    }

}

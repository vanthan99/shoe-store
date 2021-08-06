package com.shoesstore.controller;

import com.shoesstore.entity.Category;
import com.shoesstore.repository.CategoryRepository;
import com.shoesstore.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/category")
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    @GetMapping
    public List<Category> getAll(){
        return categoryService.findAll();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteById(@PathVariable("id") UUID id){
        return categoryService.deleteById(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> toggleEnable(@PathVariable("id") UUID id){
        return categoryService.toggleStatus(id);
    }
}

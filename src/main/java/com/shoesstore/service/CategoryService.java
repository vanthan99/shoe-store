package com.shoesstore.service;

import com.shoesstore.entity.Category;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.UUID;

public interface CategoryService {
    ResponseEntity<Object> deleteById(UUID catId);

    ResponseEntity<Object> toggleStatus(UUID catId);

    List<Category> findAll();
}

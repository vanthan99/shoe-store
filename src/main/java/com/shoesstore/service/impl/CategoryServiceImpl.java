package com.shoesstore.service.impl;

import com.shoesstore.entity.Category;
import com.shoesstore.payload.request.CategoryRequest;
import com.shoesstore.payload.response.Response;
import com.shoesstore.repository.CategoryRepository;
import com.shoesstore.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryRepository categoryRepository;


    @Override
    public ResponseEntity<Object> deleteById(UUID catId) {
        Category category = categoryRepository.findById(catId)
                .orElseThrow(() -> new RuntimeException("Category not found"));

        category.setDeleteFlag(true);
        categoryRepository.save(category);
        return ResponseEntity.ok().build();
    }

    @Override
    public ResponseEntity<Object> toggleStatus(UUID catId) {
        Category category = categoryRepository.findById(catId)
                .orElseThrow(() -> new RuntimeException("Category not found"));
        category.setEnable(!category.isEnable());
        categoryRepository.save(category);
        return ResponseEntity.ok().body(category.isEnable());
    }

    @Override
    public List<Category> findAll() {
        return categoryRepository.findByDeleteFlagFalseAndEnableTrue();
    }

    @Override
    public Response save(CategoryRequest categoryRequest) {
        Category category = new Category(categoryRequest.getName());
        categoryRepository.save(category);
        return new Response();
    }

    @Override
    public Response edit(UUID uuid, CategoryRequest categoryRequest) {
        Category category = categoryRepository.findById(uuid)
                .orElseThrow(() -> new RuntimeException(""));

        category.setName(categoryRequest.getName());
        categoryRepository.save(category);
        return new Response();
    }
}

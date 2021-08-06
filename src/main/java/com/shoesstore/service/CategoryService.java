package com.shoesstore.service;

import com.shoesstore.entity.Category;
import com.shoesstore.payload.request.CategoryRequest;
import com.shoesstore.payload.response.Response;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.UUID;

public interface CategoryService {
    ResponseEntity<Object> deleteById(UUID catId);

    ResponseEntity<Object> toggleStatus(UUID catId);

    List<Category> findAll();

    Response save(CategoryRequest categoryRequest);

    Response edit(UUID uuid,CategoryRequest categoryRequest);
}

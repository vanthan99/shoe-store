package com.shoesstore.helper;

import com.shoesstore.entity.Category;
import com.shoesstore.repository.CategoryRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.UUID;

@Slf4j
public class CategoryHelper {
    @Autowired
    CategoryRepository categoryRepository;
}

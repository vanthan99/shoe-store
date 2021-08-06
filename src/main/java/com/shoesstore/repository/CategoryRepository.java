package com.shoesstore.repository;

import com.shoesstore.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface CategoryRepository extends JpaRepository<Category, UUID> {

    @Query("SELECT c FROM Category c where c.id = :id and c.deleteFlag = false")
    Optional<Category> findById(UUID id);

    List<Category> findByDeleteFlagFalseAndEnableTrue();
}

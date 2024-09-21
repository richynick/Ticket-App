package com.richard.ticketing.repository;

import com.richard.ticketing.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}

package com.richard.ticketing.service.implementation;

import com.richard.ticketing.model.Category;
import com.richard.ticketing.repository.CategoryRepository;
import com.richard.ticketing.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    @Override
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    @Override
    public Optional<Category> getCategoryById(Long id) {
        return categoryRepository.findById(id);
    }

    @Override
    public Category createCategory(Category category) {

        Category newCategory = Category.builder()
                .name(category.getName())
                .build();

        Category savedCategory = categoryRepository.save(newCategory);
        return savedCategory;
    }

    @Override
    public Category updateCategory(Long id, Category category) {
        Optional<Category> existingCategory = categoryRepository.findById(id);
        if (existingCategory.isPresent()) {
            Category updatedCategory = existingCategory.get();
            updatedCategory.setName(category.getName());
            // Update other fields if necessary
            return categoryRepository.save(updatedCategory);
        } else {
            throw new RuntimeException("Category not found");
        }
    }

    @Override
    public void deleteCategory(Long id) {
        if (categoryRepository.existsById(id)) {
            categoryRepository.deleteById(id);
        } else {
            throw new RuntimeException("Category not found");
        }
    }
}

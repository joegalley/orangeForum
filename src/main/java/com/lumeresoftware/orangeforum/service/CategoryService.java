package com.lumeresoftware.orangeforum.service;

import com.lumeresoftware.orangeforum.dao.CategoryRepository;
import com.lumeresoftware.orangeforum.model.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public Category create(Category category) {
        return categoryRepository.save(category);
    }

    public Optional<Category> findOne(String id) {
        return Optional.ofNullable(categoryRepository.findOne(id));
    }
}

package com.ecommerce.project.Service;

import com.ecommerce.project.Model.Category;

import java.util.ArrayList;
import java.util.List;

public interface CategoryService {
    List<Category> getAllCategories();
    void createCategory(Category category);
}

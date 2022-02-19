package com.hepsiemlak.emlakoop.repository;

import com.hepsiemlak.emlakoop.model.Category;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Repository
public class CategoryRepository {

    List<Category> categories = new ArrayList<>();

    public void add(Category category) {
        categories.add(category);
    }

    public List<Category> getCategories() {
        return categories;
    }

    public Category getCategory(String id) {
        for (Category category : categories) {
            if (Objects.equals(category.getId(), id)) {
                return category;
            }
        }
        return null;
    }
}

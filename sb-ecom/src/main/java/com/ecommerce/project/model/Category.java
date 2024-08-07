package com.ecommerce.project.model;

public class Category {
    private Long categoryId;
    private String categoryName;

    public Category(Long categoryid, String categoryname) {
        this.categoryId = categoryid;
        this.categoryName = categoryname;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}

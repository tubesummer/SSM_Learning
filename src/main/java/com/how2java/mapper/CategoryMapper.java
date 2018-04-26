package com.how2java.mapper;

import com.how2java.pojo.Category;

import java.util.List;

public interface CategoryMapper {
    public void add(Category category);
    public void delete(int id);
    public Category get(int id);
    public void update(Category category);
    public List<Category> list();
    public int count();

}

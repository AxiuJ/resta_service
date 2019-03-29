package com.axiuj.springcloud.providercategory.service;

import com.axiuj.springcloud.model.entity.Category;

import java.util.List;

/**
 * @创建人 axiuj
 * @创建时间 2019/2/7
 * @描述
 */
public interface CategoryService {
    public List<Category> list();

    public int delete(Category category);

    public Category get(Integer categoryId);

    public int add(Category category);

    public int updata(Category category);

    List<Category> findbyname(Category category);

    int updateusble(Category category);
}

package com.axiuj.springcloud.providercategory.service.impl;

import com.axiuj.springcloud.model.entity.Category;
import com.axiuj.springcloud.providercategory.dao.CategoryDao;
import com.axiuj.springcloud.providercategory.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @创建人 axiuj
 * @创建时间 2019/2/7
 * @描述
 */
@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryDao dao;

    @Override
    public List<Category> list() {
        return dao.list();
    }

    @Override
    public int delete(Category category) {
        return dao.delete(category);
    }

    @Override
    public int add(Category category) {
        return dao.add(category);
    }

    public Category get(Integer categoryId) {
        return dao.get(categoryId);
    }

    @Override
    public int updata(Category category) {
        return dao.updata(category);
    }

    @Override
    public List<Category> findbyname(Category category) {
        return dao.findbyname(category);
    }

    @Override
    public int updateusble(Category category) {
        return dao.updateusble(category);
    }
}

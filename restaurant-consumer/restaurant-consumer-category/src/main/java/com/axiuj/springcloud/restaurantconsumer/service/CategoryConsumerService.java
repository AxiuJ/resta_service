package com.axiuj.springcloud.restaurantconsumer.service;

import com.axiuj.springcloud.model.entity.Category;

import java.util.List;

/**
 * @创建人 axiuj
 * @创建时间 2019/2/7
 * @描述
 */
public interface CategoryConsumerService {
    public List<Category> list();

    public int delete(Category category);

    public Category get(long categoryId);

    public int add(Category category);

    public int updata(Category category);
}


package com.axiuj.springcloud.restaurantconsumer.service.impl;

import com.axiuj.springcloud.model.entity.Category;
import com.axiuj.springcloud.model.service.CategoryFeignService;
import com.axiuj.springcloud.restaurantconsumer.service.CategoryConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @创建人 axiuj
 * @创建时间 2019/2/7
 * @描述
 */
@Service
public class CategoryConsumerServiceImpl implements CategoryConsumerService {
    @Autowired

    private CategoryFeignService categoryFeignService;
    @Override
    public List<Category> list() {
        return categoryFeignService.list();
    }

    @Override
    public int delete(Category category) {
        return categoryFeignService.delete(category);
    }

    @Override
    public int add(Category category) {
        return categoryFeignService.add(category);
    }

    @Override
    public Category get(long categoryId) {
        return categoryFeignService.get(categoryId);
    }

    @Override
    public int updata(Category category){
        return categoryFeignService.updata(category);
    }


}


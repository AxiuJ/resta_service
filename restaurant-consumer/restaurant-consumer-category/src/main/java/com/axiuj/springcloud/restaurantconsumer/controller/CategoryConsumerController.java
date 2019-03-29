package com.axiuj.springcloud.restaurantconsumer.controller;

import com.axiuj.springcloud.model.entity.Category;
import com.axiuj.springcloud.restaurantconsumer.service.CategoryConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @创建人 axiuj
 * @创建时间 2019/2/7
 * @描述
 */
@RestController
public class CategoryConsumerController {
    @Autowired
    private CategoryConsumerService service;
    @PostMapping("/list")
    public List<Category> list(){
        return service.list();
    }
    @PostMapping("/delete")
    public int delete(Category category){
        return service.delete(category);
    }

    @PostMapping("/add")
    public int add(Category category){
        return service.add(category);
    }

    @PostMapping("/get")
    public Category get(@RequestParam(value = "categoryId",defaultValue = "0") long categoryId){
        return service.get(categoryId);
    }

    @PostMapping("/updata")
    public int updata(Category category){
        return service.updata(category);
    }
}

package com.axiuj.springcloud.providercategory.controller;

import com.axiuj.springcloud.model.entity.Category;
import com.axiuj.springcloud.providercategory.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @创建人 axiuj
 * @创建时间 2019/2/7
 * @描述
 */
@RestController
public class CategoryController {

    @Autowired
    private CategoryService service;
    @PostMapping("/list")
    public List<Category> list(){
        return service.list();
    };
    @PostMapping("/delete")
    public int delete(@RequestBody Category category){
        return service.delete(category);
    };
    @PostMapping("/get")
    public Category get(Integer categoryId){
        return service.get(categoryId);
    };
    @PostMapping("/add")
    public int add(@RequestBody Category category){
        return service.add(category);
    };
    @PostMapping("/updata")
    public int updata(@RequestBody Category category){
        return service.updata(category);
    };
    @PostMapping("/findbyname")
    public List<Category> findbyname(@RequestBody Category category){
        return service.findbyname(category);
    };
    @PostMapping("/updateusble")
    public int updateusble(@RequestBody Category category){
        return service.updateusble(category);
    }

}

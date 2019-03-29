package com.axiuj.springcloud.model.service;

import com.axiuj.springcloud.model.entity.Category;
import com.axiuj.springcloud.model.service.hystrix.CategoryFeignServiceHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @创建人 axiuj
 * @创建时间 2019/2/7
 * @描述
 */
@FeignClient(value = "restaurant-procider-category",fallbackFactory = CategoryFeignServiceHystrix.class)
public interface CategoryFeignService {
    @PostMapping(value = "/list")
    public List<Category> list();

    @PostMapping("/delete")
    public int delete(@RequestBody Category category);

    @PostMapping("/get")
    public Category get(@RequestParam(value = "categoryId",defaultValue = "0") long categoryId);

    @PostMapping("/add")
    public int add(@RequestBody Category category);

    @PostMapping("/updata")
    public int updata(@RequestBody Category category);

    @PostMapping("/findbyname")
    public List<Category> findbyname(@RequestBody Category category);

    @PostMapping("/updateusble")
    public int updateusble(@RequestBody Category category);
}

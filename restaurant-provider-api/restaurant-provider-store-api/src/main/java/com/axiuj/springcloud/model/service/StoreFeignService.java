package com.axiuj.springcloud.model.service;

import com.axiuj.springcloud.model.entity.Store;
import com.axiuj.springcloud.model.service.hystrix.StoreFeignServiceHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @创建人 axiuj
 * @创建时间 2019/1/17
 * @描述
 */

@FeignClient(value = "restaurant-procider-store",fallbackFactory = StoreFeignServiceHystrix.class)
public interface StoreFeignService {
    @PostMapping(value = "/list")
    public List<Store> list();

    @PostMapping("/delete")
    public int delete(@RequestParam(value = "storeId",defaultValue = "0") long storeId);

    @PostMapping("/get")
    public Store get(@RequestParam(value = "storeId",defaultValue = "0") long storeId);

    @PostMapping("/add")
    public int add(@RequestBody Store store);

    @PostMapping("/updata")
    public int updata(@RequestBody Store store);

}

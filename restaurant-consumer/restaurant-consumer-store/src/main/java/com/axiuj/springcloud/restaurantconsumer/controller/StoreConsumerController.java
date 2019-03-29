package com.axiuj.springcloud.restaurantconsumer.controller;

import com.axiuj.springcloud.model.entity.Store;
import com.axiuj.springcloud.restaurantconsumer.service.StoreConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @创建人 axiuj
 * @创建时间 2019/1/17
 * @描述
 */
@RestController
public class StoreConsumerController {
    @Autowired
    private StoreConsumerService service;
    @PostMapping ("/list")
    public List<Store> list(){
        return service.list();
    }
    @PostMapping("/delete")
    public int delete(@RequestParam(value = "storeId",defaultValue = "0") long storeId){
        return service.delete(storeId);
    }

    @PostMapping("/add")
    public int add(Store store){
        return service.add(store);
    }

    @PostMapping("/get")
    public Store get(@RequestParam(value = "storeId",defaultValue = "0") long storeId){
        return service.get(storeId);
    }

    @PostMapping("/updata")
    public int updata(Store store){
        return service.updata(store);
    }
}

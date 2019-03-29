package com.axiuj.springcloud.providerstore.controller;

/**
 * @创建人 axiuj
 * @创建时间 2019/1/14
 * @描述
 */

import com.axiuj.springcloud.model.entity.Store;
import com.axiuj.springcloud.providerstore.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StoreController {
    @Autowired
    private StoreService service;

    @PostMapping("/list")
    public List<Store> list() {
        return service.list();
    }

    @PostMapping("/delete")
    public int delect(Integer storeId) {
        return service.delete(storeId);
    }

    @PostMapping("/get")
    public Store get(Integer storeId) {
        return service.get(storeId);
    }

    ;

    @PostMapping("/add")
    public int add(@RequestBody Store store) {
        return service.add(store);
    }

    @PostMapping("/updata")
    public int updata(@RequestBody Store store) {
        return service.updata(store);
    }
}

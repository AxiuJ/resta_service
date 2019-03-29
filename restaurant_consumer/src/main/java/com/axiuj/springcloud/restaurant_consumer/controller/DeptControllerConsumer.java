package com.axiuj.springcloud.restaurant_consumer.controller;

import com.axiuj.springcloud.model.entity.Store;
import com.axiuj.springcloud.model.service.StoreFeignService;
import com.axiuj.springcloud.restaurant_api.Dept;
import com.axiuj.springcloud.restaurant_api.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DeptControllerConsumer {

    @Autowired
    private DeptClientService deptClientService;

    @RequestMapping(value = "/dept/list",method = RequestMethod.GET)
    public List<Dept> list(){
        return deptClientService.list();
    }

}

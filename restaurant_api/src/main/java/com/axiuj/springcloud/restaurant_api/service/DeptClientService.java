package com.axiuj.springcloud.restaurant_api.service;

import com.axiuj.springcloud.restaurant_api.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(value = "RESTAURANT-PROCIDER",fallbackFactory = DeptClientHystrix.class)
public interface DeptClientService {
    @RequestMapping(value = "/dept/list",method = RequestMethod.GET)
    public List<Dept> list();
}

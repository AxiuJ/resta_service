package com.axiuj.springcloud.model.service;

import com.axiuj.springcloud.model.entity.Menus;
import com.axiuj.springcloud.model.service.hystrix.MenusFeignServiceHystrix;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @创建人 axiuj
 * @创建时间 2019/2/11
 * @描述
 */
@FeignClient(value = "restaurant-provider-menus",fallbackFactory = MenusFeignServiceHystrix.class)
public interface MenusFeignService {
    @PostMapping(value = "/list")
    public List<Menus> list();

    @PostMapping("/delete")
    public int delete(@RequestBody Menus menus);

    @PostMapping("/get")
    public Menus get(@RequestParam(value = "menusId",defaultValue = "0") long menusId);

    @PostMapping("/add")
    public int add(@RequestBody Menus menus);

    @PostMapping("/updata")
    public int updata(@RequestBody Menus menus);

    @PostMapping("/menuslist")
    public List<Menus> menusList(@RequestBody Menus menus);

    @PostMapping("/findbycategory")
    public int findbycategory(@RequestBody Menus menus);
}

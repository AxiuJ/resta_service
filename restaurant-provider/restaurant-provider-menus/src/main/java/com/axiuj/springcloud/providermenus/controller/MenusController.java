package com.axiuj.springcloud.providermenus.controller;

import com.axiuj.springcloud.model.entity.Category;
import com.axiuj.springcloud.model.entity.Menus;
import com.axiuj.springcloud.providermenus.service.MenusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @创建人 axiuj
 * @创建时间 2019/2/11
 * @描述
 */
@RestController
public class MenusController {

    @Autowired
    private MenusService service;
    @PostMapping("/list")
    public List<Menus> list(){
        return service.list();
    };
    @PostMapping("/delete")
    public int delete(@RequestBody Menus menus){
        return service.delete(menus.getMenusId());
    };
    @PostMapping("/get")
    public Menus get(Integer menusId){
        return service.get(menusId);
    };
    @PostMapping("/add")
    public int add(@RequestBody Menus menus){
        return service.add(menus);
    };
    @PostMapping("/updata")
    public int updata(@RequestBody Menus menus){
        return service.updata(menus);
    };
    @PostMapping("/menuslist")
    public List<Menus> menuslist(@RequestBody Menus menus){
        return service.menuslist(menus.getStoreId());
    }
    @PostMapping("/findbycategory")
    public int findbycategory(@RequestBody Menus menus){
        return service.findbycategory(menus);
    }
}


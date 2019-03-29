package com.axiuj.springcloud.restaurantconsumer.controller;

import com.axiuj.springcloud.Api.APIResponse;
import com.axiuj.springcloud.model.entity.Category;
import com.axiuj.springcloud.model.entity.Menus;
import com.axiuj.springcloud.restaurantconsumer.service.MenusConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @创建人 axiuj
 * @创建时间 2019/2/11
 * @描述
 */
@RestController
public class MenusConsumerController {
    @Autowired
    private MenusConsumerService service;
    @PostMapping("/list")
    public List<Menus> list(){
        return service.list();
    }
    @PostMapping("/delete")
    public APIResponse delete(@RequestBody Menus menus){
        return service.delete(menus);
    }

    @PostMapping("/deletecategoryid")
    public APIResponse deletecategoryid(@RequestBody Menus menus){
        return service.deletecda(menus);
    }

    @PostMapping("/add")
    public APIResponse add(@RequestBody Menus menus){
        return service.add(menus);
    }

    @PostMapping("/get")
    public Menus get(@RequestParam(value = "menusId",defaultValue = "0") long menusId){
        return service.get(menusId);
    }

    @PostMapping("/updata")
    public APIResponse updata(@RequestBody Menus menus){
        return service.updata(menus);
    }
    @PostMapping("/init")
    public APIResponse menusinit(@RequestBody Menus menus){
        return service.menusinit(menus);
    }
    @PostMapping("/addcategory")
    public APIResponse addcategory(@RequestBody Category category){
        if(category.getCategoryName().equals("") || category.getCategoryName()==null){
            return APIResponse.other(501,"类型不能为空",null);
        }
        return service.addcategory(category);
    }
}

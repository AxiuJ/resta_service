package com.axiuj.springcloud.restaurantconsumer.service.impl;

import com.axiuj.springcloud.Api.APIResponse;
import com.axiuj.springcloud.model.entity.Category;
import com.axiuj.springcloud.model.entity.Menus;
import com.axiuj.springcloud.model.service.CategoryFeignService;
import com.axiuj.springcloud.model.service.MenusFeignService;
import com.axiuj.springcloud.restaurantconsumer.entity.menusandcategory;
import com.axiuj.springcloud.restaurantconsumer.service.MenusConsumerService;
import com.sun.org.apache.bcel.internal.generic.RETURN;
import jdk.nashorn.internal.ir.ReturnNode;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.*;
import java.util.List;

/**
 * @创建人 axiuj
 * @创建时间 2019/2/11
 * @描述
 */
@Service
public class MenusConsumerServiceImpl implements MenusConsumerService {
    @Autowired

    private MenusFeignService menusFeignService;
    @Autowired
    private CategoryFeignService categoryFeignService;
    @Override
    public List<Menus> list() {
        return menusFeignService.list();
    }

    @Override
    public APIResponse delete(Menus menus) {
        return APIResponse.success(menusFeignService.delete(menus));
    }

    @Override
    public APIResponse add(Menus menus) {
        return APIResponse.success(menusFeignService.add(menus));
    }

    @Override
    public Menus get(long menusId) {
        return menusFeignService.get(menusId);
    }

    @Override
    public APIResponse updata(Menus menus){
        if(menusFeignService.updata(menus)==1){
            return APIResponse.success(menusFeignService.updata(menus));
        }else{
            return APIResponse.fail();
        }

    }

    @Override
    public APIResponse menusinit(Menus menus) {
        menusandcategory mc=new menusandcategory();
        mc.setMenuss(menusFeignService.menusList(menus));
        mc.setCategorys(categoryFeignService.list());
        return APIResponse.success(mc);
    }


    @Override
    public APIResponse deletecda(Menus menus) {
        Category category = new Category().setCategoryId(menus.getCategoryId());
        int tem=menusFeignService.findbycategory(menus);
        if (tem>=1){
            return APIResponse.fail();
        }
        return APIResponse.success(categoryFeignService.delete(category)==1);
    }

    @Override
    public APIResponse addcategory(Category category) {
        List<Category> ca = categoryFeignService.findbyname(category);
        if (ca.size()==1 && ca.get(0).getUsable()==0){
            System.out.println(ca.get(0));
            if (categoryFeignService.updateusble(ca.get(0))==1){
                return APIResponse.success(categoryFeignService.list());
            }
        }
        if (ca.size()==0){
            if (categoryFeignService.add(category)==1){
                return APIResponse.success(categoryFeignService.list());
            }
        }
        return APIResponse.other(502,"类型已存在",null);
    }
}


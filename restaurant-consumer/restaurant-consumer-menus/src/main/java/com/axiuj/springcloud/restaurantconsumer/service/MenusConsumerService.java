package com.axiuj.springcloud.restaurantconsumer.service;

import com.axiuj.springcloud.Api.APIResponse;
import com.axiuj.springcloud.model.entity.Category;
import com.axiuj.springcloud.model.entity.Menus;

import java.util.List;

/**
 * @创建人 axiuj
 * @创建时间 2019/2/11
 * @描述
 */
public interface MenusConsumerService {
    public List<Menus> list();

    public APIResponse delete(Menus menus);

    public Menus get(long menusId);

    public APIResponse add(Menus menus);

    public APIResponse updata(Menus menus);

    APIResponse menusinit(Menus menus);

    APIResponse deletecda(Menus menus);

    APIResponse addcategory(Category category);
}


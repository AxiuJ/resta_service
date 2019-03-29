package com.axiuj.springcloud.providermenus.service;

import com.axiuj.springcloud.model.entity.Category;
import com.axiuj.springcloud.model.entity.Menus;

import java.lang.management.MemoryUsage;
import java.util.List;

/**
 * @创建人 axiuj
 * @创建时间 2019/2/11
 * @描述
 */
public interface MenusService {
    public List<Menus> list();

    public int delete(Integer menusId);

    public Menus get(Integer menusId);

    public int add(Menus menus);

    public int updata(Menus menus);

    public List<Menus> menuslist(int storeid);

    int findbycategory(Menus menus);
}


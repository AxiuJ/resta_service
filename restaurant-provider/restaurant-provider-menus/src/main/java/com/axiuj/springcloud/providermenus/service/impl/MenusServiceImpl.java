package com.axiuj.springcloud.providermenus.service.impl;

import com.axiuj.springcloud.model.entity.Category;
import com.axiuj.springcloud.model.entity.Menus;
import com.axiuj.springcloud.providermenus.dao.MenusDao;
import com.axiuj.springcloud.providermenus.service.MenusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @创建人 axiuj
 * @创建时间 2019/2/11
 * @描述
 */
@Service
public class MenusServiceImpl implements MenusService {
    @Autowired
    private MenusDao dao;

    @Override
    public List<Menus> list() {
        return dao.list();
    }

    @Override
    public int delete(Integer menusId) {
        return dao.delete(menusId);
    }

    @Override
    public int add(Menus menus) {
        return dao.add(menus);
    }

    public Menus get(Integer menusId) {
        return dao.get(menusId);
    }

    @Override
    public int updata(Menus menus) {
        return dao.updata(menus);
    }

    @Override
    public List<Menus> menuslist(int storeid) {
        System.out.println("sadf"+storeid);
        return dao.menuslist(storeid);
    }

    @Override
    public int findbycategory(Menus menus) {
        return dao.findbycategoryid(menus).size();
    }
}


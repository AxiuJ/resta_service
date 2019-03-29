package com.axiuj.springcloud.providermenus.dao;

import com.axiuj.springcloud.model.entity.Menus;
import org.apache.ibatis.annotations.Mapper;

import java.awt.*;
import java.lang.management.MemoryUsage;
import java.util.List;

/**
 * @创建人 axiuj
 * @创建时间 2019/2/11
 * @描述
 */
@Mapper
public interface MenusDao {

    public List<Menus> list();

    public int delete(Integer menusId);

    public Menus get(Integer menusId);

    public int add(Menus menus);

    public int updata(Menus menus);

    public List<Menus> menuslist(int storeid);

    public List<Menus> findbycategoryid (Menus menus);
}


package com.axiuj.springcloud.restaurantconsumer.entity;

import com.axiuj.springcloud.model.entity.Category;
import com.axiuj.springcloud.model.entity.Menus;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.List;

/**
 * @创建人 axiuj
 * @创建时间 2019/3/12
 * @描述
 */

@Data
public class menusandcategory {
    List<Menus> menuss;
    List<Category> Categorys;
}

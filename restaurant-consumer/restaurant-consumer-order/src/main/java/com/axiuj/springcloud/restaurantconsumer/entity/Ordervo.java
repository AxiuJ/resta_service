package com.axiuj.springcloud.restaurantconsumer.entity;

import com.axiuj.springcloud.model.entity.Menus;
import com.axiuj.springcloud.model.entity.Orderform;
import com.axiuj.springcloud.model.entity.Orderitem;
import lombok.Data;

import java.util.List;

/**
 * @创建人 axiuj
 * @创建时间 2019/3/21
 * @描述  接受前台数据
 */
@Data
public class Ordervo {
    private Orderform orderform;
    private List<Orderitem> foods ;
}

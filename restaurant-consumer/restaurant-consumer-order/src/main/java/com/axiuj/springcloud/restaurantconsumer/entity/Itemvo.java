package com.axiuj.springcloud.restaurantconsumer.entity;


import com.axiuj.springcloud.model.entity.Orderform;
import com.axiuj.springcloud.model.entity.Orderitem;
import lombok.Data;

import java.util.List;

/**
 * @创建人 axiuj
 * @创建时间 2019/3/23
 * @描述
 */
@Data
public class Itemvo {
   private Orderform orderform;
   private List<Orderitem> orderitems ;
}

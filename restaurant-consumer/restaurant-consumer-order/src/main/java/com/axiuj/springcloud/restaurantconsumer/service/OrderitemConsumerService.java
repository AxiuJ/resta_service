package com.axiuj.springcloud.restaurantconsumer.service;

import com.axiuj.springcloud.Api.APIResponse;
import com.axiuj.springcloud.model.entity.Orderform;
import com.axiuj.springcloud.model.entity.Orderitem;
import com.axiuj.springcloud.restaurantconsumer.entity.Ordervo;
import com.axiuj.springcloud.page.initvo;

import java.util.List;

/**
 * @创建人 axiuj
 * @创建时间 2019/3/21
 * @描述
 */
public interface OrderitemConsumerService {
    public List<Orderitem> list();

    public int delete(Orderitem orderitem);

    public Orderitem get(Orderitem orderitem);

    public APIResponse add(Ordervo ordervo);

    public int updata(Orderitem orderitem);

    public APIResponse init(initvo initvo);

    public APIResponse checkout(Orderform orderform);

    public APIResponse uporder(List<Orderitem> orderitems);
}


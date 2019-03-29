package com.axiuj.springcloud.providerorderitem.service;

import com.axiuj.springcloud.model.entity.Orderitem;

import java.util.List;

/**
 * @创建人 axiuj
 * @创建时间 2019/3/20
 * @描述
 */
public interface OrderitemService {
    public List<Orderitem> list();

    public int delete(Integer orderitemId);

    public Orderitem get(Integer orderitemId);

    public int add(List<Orderitem> orderitems);

    public int updata(Orderitem orderitem);

    public List<Orderitem> findbyin(List list);

    public int uporders(List<Orderitem> orderitems);
}


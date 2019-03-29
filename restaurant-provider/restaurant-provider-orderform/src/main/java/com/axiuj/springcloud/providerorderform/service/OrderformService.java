package com.axiuj.springcloud.providerorderform.service;

import com.axiuj.springcloud.ChartData.Chartdata;
import com.axiuj.springcloud.model.entity.Orderform;
import com.axiuj.springcloud.model.entity.Orderitem;
import com.axiuj.springcloud.page.initvo;

import java.util.List;

/**
 * @创建人 axiuj
 * @创建时间 2019/3/20
 * @描述
 */
public interface OrderformService {
    public List<Orderform> list();

    public int delete(Integer orderformId);

    public Orderform get(Integer orderformId);

    public int add(Orderform orderform);

    public int updata(Orderform orderform);

    public List<Orderform> init(initvo initvo);

    public int findbypagesize(initvo initvo);

    public int checkout(Orderform orderform);

    public List<Chartdata> getchartdata(Orderform orderform);
}


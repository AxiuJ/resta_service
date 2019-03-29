package com.axiuj.springcloud.providerorderform.service.impl;

import com.axiuj.springcloud.ChartData.Chartdata;
import com.axiuj.springcloud.model.entity.Orderform;
import com.axiuj.springcloud.model.entity.Orderitem;
import com.axiuj.springcloud.page.initvo;
import com.axiuj.springcloud.providerorderform.dao.OrderformDao;
import com.axiuj.springcloud.providerorderform.service.OrderformService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @创建人 axiuj
 * @创建时间 2019/3/20
 * @描述
 */
@Service
public class OrderformServiceImpl implements OrderformService {
    @Autowired
    private OrderformDao dao;

    @Override
    public List<Orderform> list() {
        return dao.list();
    }

    @Override
    public int delete(Integer orderformId) {
        return dao.delete(orderformId);
    }

    @Override
    public int add(Orderform orderform) {
        dao.add(orderform);
        System.out.println(orderform.getOrderformId());
        return orderform.getOrderformId();
    }

    public Orderform get(Integer orderformId) {
        return dao.get(orderformId);
    }

    @Override
    public int updata(Orderform orderform) {
        return dao.updata(orderform);
    }

    @Override
    public List<Orderform> init(initvo initvo) {
        return dao.init(initvo);
    }

    @Override
    public int findbypagesize(initvo initvo) {
        return dao.findbypagesize(initvo).size();
    }

    @Override
    public int checkout(Orderform orderform) {
        return dao.checkout(orderform);
    }

    @Override
    public List<Chartdata> getchartdata(Orderform orderform) {
        return dao.getchartdata(orderform);
    }
}


package com.axiuj.springcloud.providerorderitem.service.impl;

import com.axiuj.springcloud.model.entity.Orderitem;
import com.axiuj.springcloud.providerorderitem.dao.OrderitemDao;
import com.axiuj.springcloud.providerorderitem.service.OrderitemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @创建人 axiuj
 * @创建时间 2019/3/20
 * @描述
 */
@Service
public class OrderitemServiceImpl implements OrderitemService {
    @Autowired
    private OrderitemDao dao;

    @Override
    public List<Orderitem> list() {
        return dao.list();
    }

    @Override
    public int delete(Integer orderitemId) {
        return dao.delete(orderitemId);
    }

    @Override
    public int add(List<Orderitem> orderitems) {
        return dao.add(orderitems);
    }

    public Orderitem get(Integer orderitemId) {
        return dao.get(orderitemId);
    }

    @Override
    public int updata(Orderitem orderitem) {
        return dao.updata(orderitem);
    }

    @Override
    public List<Orderitem> findbyin(List list) {
        return dao.findbyin(list);
    }

    @Override
    public int uporders(List<Orderitem> orderitems) {
        return dao.uporders(orderitems);
    }
}


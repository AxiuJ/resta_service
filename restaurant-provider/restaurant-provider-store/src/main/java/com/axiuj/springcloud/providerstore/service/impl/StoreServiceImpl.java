package com.axiuj.springcloud.providerstore.service.impl;

import com.axiuj.springcloud.model.entity.Store;
import com.axiuj.springcloud.providerstore.dao.StoreDao;
import com.axiuj.springcloud.providerstore.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @创建人 axiuj
 * @创建时间 2019/1/14
 * @描述
 */
@Service
public class StoreServiceImpl implements StoreService {
    @Autowired
    private StoreDao dao;

    @Override
    public List<Store> list() {
        return dao.list();
    }

    @Override
    public int delete(Integer storeId) {
        return dao.delete(storeId);
    }

    @Override
    public int add(Store store) {
        return dao.add(store);
    }

    public Store get(Integer storeId) {
        return dao.get(storeId);
    }

    @Override
    public int updata(Store store) {
        return dao.updata(store);
    }
}

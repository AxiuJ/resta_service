package com.axiuj.springcloud.restaurantconsumer.service;

import com.axiuj.springcloud.model.entity.Store;

import java.util.List;

/**
 * @创建人 axiuj
 * @创建时间 2019/1/17
 * @描述
 */
public interface StoreConsumerService {
    public List<Store> list();

    public int delete(long storeId);

    public Store get(long storeId);

    public int add(Store store);

    public int updata(Store store);
}

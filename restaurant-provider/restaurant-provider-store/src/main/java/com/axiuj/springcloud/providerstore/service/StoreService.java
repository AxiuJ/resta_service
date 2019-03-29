package com.axiuj.springcloud.providerstore.service;

import com.axiuj.springcloud.model.entity.Store;

import java.util.List;

/**
 * @创建人 axiuj
 * @创建时间 2019/1/14
 * @描述
 */
public interface StoreService {
    /**
     * Store查询全部
     *
     * @return
     */
    public List<Store> list();

    /**
     * @return
     */
    public int delete(Integer storeId);

    public int add(Store store);

    public Store get(Integer storeId);

    public int updata(Store store);
}

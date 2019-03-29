package com.axiuj.springcloud.restaurantconsumer.service.impl;

import com.axiuj.springcloud.model.entity.Store;
import com.axiuj.springcloud.model.service.StoreFeignService;
import com.axiuj.springcloud.restaurantconsumer.service.StoreConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @创建人 axiuj
 * @创建时间 2019/1/17
 * @描述
 */
@Service
public class StoreConsumerServiceImpl implements StoreConsumerService {
    @Autowired

    private StoreFeignService storeFeignService;
    @Override
    public List<Store> list() {
        return storeFeignService.list();
    }

    @Override
    public int delete(long storeId) {
        return storeFeignService.delete(storeId);
    }

    @Override
    public int add(Store store) {
        return storeFeignService.add(store);
    }

    @Override
    public Store get(long storeId) {
        return storeFeignService.get(storeId);
    }

    @Override
    public int updata(Store store){
        return storeFeignService.updata(store);
    }


}

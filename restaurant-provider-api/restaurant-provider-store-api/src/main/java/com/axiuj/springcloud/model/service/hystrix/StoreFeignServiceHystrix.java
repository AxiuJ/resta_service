package com.axiuj.springcloud.model.service.hystrix;

import com.axiuj.springcloud.model.entity.Store;
import com.axiuj.springcloud.model.service.StoreFeignService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @创建人 axiuj
 * @创建时间 2019/1/17
 * @描述
 */
@Component
public class StoreFeignServiceHystrix implements FallbackFactory<StoreFeignService> {

    @Override
    public StoreFeignService create(Throwable throwable) {
        return new StoreFeignService() {
            @Override
            public List<Store> list() {
                return null;
            }

            @Override
            public int delete(long storeId) {
                return 0;
            }

            @Override
            public int add(Store store) {
                return 0;
            }

            @Override
            public Store get(long storeId) {
                return null;
            }

            @Override
            public int updata(Store store) {
                return 0;
            }
        };
    }
}

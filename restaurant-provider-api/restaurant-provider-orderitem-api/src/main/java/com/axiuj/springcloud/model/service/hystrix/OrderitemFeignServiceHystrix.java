package com.axiuj.springcloud.model.service.hystrix;

import com.axiuj.springcloud.model.entity.Orderitem;
import com.axiuj.springcloud.model.service.OrderitemFeignService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @创建人 axiuj
 * @创建时间 2019/3/20
 * @描述
 */
@Component
public class OrderitemFeignServiceHystrix implements FallbackFactory<OrderitemFeignService> {
    @Override
    public OrderitemFeignService create(Throwable throwable) {
        return new OrderitemFeignService() {
            @Override
            public List<Orderitem> list() {
                return null;
            }

            @Override
            public int delete(Orderitem orderitem) {
                return 0;
            }

            @Override
            public Orderitem get(Orderitem orderitem) {
                return null;
            }

            @Override
            public int add(List<Orderitem> orderitems) {
                return 0;
            }

            @Override
            public int updata(Orderitem orderitem) {
                return 0;
            }

            @Override
            public List<Orderitem> findbyin(List list) {
                return null;
            }

            @Override
            public int uporders(List<Orderitem> Orderitems) {
                return 0;
            }
        };
    }
}


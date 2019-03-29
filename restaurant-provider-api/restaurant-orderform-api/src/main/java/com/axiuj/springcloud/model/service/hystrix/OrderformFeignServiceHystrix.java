package com.axiuj.springcloud.model.service.hystrix;

import com.axiuj.springcloud.ChartData.Chartdata;
import com.axiuj.springcloud.model.entity.Orderform;
import com.axiuj.springcloud.model.service.OrderformFeignService;
import com.axiuj.springcloud.page.initvo;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.awt.*;
import java.util.List;

/**
 * @创建人 axiuj
 * @创建时间 2019/3/20
 * @描述
 */
@Component
public class OrderformFeignServiceHystrix implements FallbackFactory<OrderformFeignService> {
    @Override
    public OrderformFeignService create(Throwable throwable) {
        return new OrderformFeignService() {
            @Override
            public List<Orderform> list() {
                return null;
            }

            @Override
            public int delete(Orderform orderform) {
                return 0;
            }

            @Override
            public Orderform get(Orderform orderform) {
                return null;
            }

            @Override
            public int add(Orderform orderform) {
                return 0;
            }

            @Override
            public int updata(Orderform orderform) {
                return 0;
            }

            @Override
            public List<Orderform> findbypage(initvo initvo) {
                return null;
            }

            @Override
            public int findbypagesize(initvo initvo) {
                return 0;
            }

            @Override
            public int checkout(Orderform orderform) {
                return 0;
            }

            @Override
            public List<Chartdata> getchartdata(Orderform orderform) {
                return null;
            }
        };
    }
}
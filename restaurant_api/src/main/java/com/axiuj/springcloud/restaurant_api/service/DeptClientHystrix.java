package com.axiuj.springcloud.restaurant_api.service;

import com.axiuj.springcloud.restaurant_api.Dept;
import com.axiuj.springcloud.restaurant_api.service.DeptClientService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @创建人 axiuj
 * @创建时间 2019/1/13
 * @描述
 */
@Component
public class DeptClientHystrix implements FallbackFactory<DeptClientService> {

    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public List<Dept> list() {
                List<Dept> u = new ArrayList<Dept>();
                Dept d = new Dept().setUser("uuu");
                u.add(d);
                return u;
            }
        };
    }
}

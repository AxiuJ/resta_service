package com.axiuj.springcloud.model.service;

import com.axiuj.springcloud.model.entity.Orderitem;
import com.axiuj.springcloud.model.service.hystrix.OrderitemFeignServiceHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * @创建人 axiuj
 * @创建时间 2019/3/20
 * @描述
 */
@FeignClient(value = "restaurant-procider-orderitem",fallbackFactory = OrderitemFeignServiceHystrix.class)
public interface OrderitemFeignService {
    @PostMapping(value = "/list")
    public List<Orderitem> list();

    @PostMapping("/delete")
    public int delete(@RequestBody Orderitem orderitem);

    @PostMapping("/get")
    public Orderitem get(@RequestBody Orderitem orderitem);

    @PostMapping("/add")
    public int add(@RequestBody List<Orderitem> orderitems);

    @PostMapping("/updata")
    public int updata(@RequestBody Orderitem orderitem);

    @PostMapping("/findbyin")
    public List<Orderitem> findbyin(@RequestBody List list);

    @PostMapping("/uporders")
    public int uporders(@RequestBody List<Orderitem> Orderitems);
}

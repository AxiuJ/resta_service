package com.axiuj.springcloud.model.service;

import com.axiuj.springcloud.ChartData.Chartdata;
import com.axiuj.springcloud.model.entity.Orderform;
import com.axiuj.springcloud.model.service.hystrix.OrderformFeignServiceHystrix;
import com.axiuj.springcloud.page.initvo;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.constraints.Size;
import java.util.List;

/**
 * @创建人 axiuj
 * @创建时间 2019/3/20
 * @描述
 */
@FeignClient(value = "restaurant-procider-orderform",fallbackFactory = OrderformFeignServiceHystrix.class)
public interface OrderformFeignService {
    @PostMapping(value = "/list")
    public List<Orderform> list();

    @PostMapping("/delete")
    public int delete(@RequestBody Orderform orderform);

    @PostMapping("/get")
    public Orderform get(@RequestBody Orderform orderform);

    @PostMapping("/add")
    public int add(@RequestBody Orderform orderform);

    @PostMapping("/updata")
    public int updata(@RequestBody Orderform orderform);

    @PostMapping("/findbypage")
    public List<Orderform> findbypage(@RequestBody initvo initvo);

    @PostMapping("/findbypagesize")
    public int findbypagesize(@RequestBody initvo initvo);

    @PostMapping("/checkout")
    public int checkout(@RequestBody Orderform orderform);

    @PostMapping("/getchartdata")
    public List<Chartdata> getchartdata(@RequestBody Orderform orderform);
}


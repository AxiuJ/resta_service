package com.axiuj.springcloud.providerorderform.controller;

import com.axiuj.springcloud.ChartData.Chartdata;
import com.axiuj.springcloud.model.entity.Orderform;
import com.axiuj.springcloud.model.entity.Orderitem;
import com.axiuj.springcloud.page.initvo;
import com.axiuj.springcloud.providerorderform.service.OrderformService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @创建人 axiuj
 * @创建时间 2019/3/20
 * @描述
 */
@RestController
public class OrderformController {

    @Autowired
    private OrderformService service;
    @PostMapping("/list")
    public List<Orderform> list(){
        return service.list();
    };
    @PostMapping("/delete")
    public int delete(@RequestBody Orderform orderform){
        return service.delete(orderform.getOrderformId());
    };
    @PostMapping("/get")
    public Orderform get(@RequestBody Orderform orderform){
        return service.get(orderform.getOrderformId());
    };
    @PostMapping("/add")
    public int add(@RequestBody Orderform orderform){
        return service.add(orderform);
    };
    @PostMapping("/updata")
    public int updata(@RequestBody Orderform orderform){
        return service.updata(orderform);
    };
    @PostMapping("/findbypage")
    public List<Orderform> findbypage(@RequestBody initvo initvo){
        return service.init(initvo);
    }
    @PostMapping("/findbypagesize")
    public int findbypagesize(@RequestBody initvo initvo){
        return service.findbypagesize(initvo);
    };

    @PostMapping("/checkout")
    public int checkout(@RequestBody Orderform orderform){
      return service.checkout(orderform);
    };

    @PostMapping("/getchartdata")
    public List<Chartdata> getchartdata(@RequestBody Orderform orderform){
        return service.getchartdata(orderform);
    };
}


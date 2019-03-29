package com.axiuj.springcloud.restaurantconsumer.controller;

import com.axiuj.springcloud.Api.APIResponse;
import com.axiuj.springcloud.model.entity.Orderform;
import com.axiuj.springcloud.model.entity.Orderitem;
import com.axiuj.springcloud.restaurantconsumer.entity.Ordervo;
import com.axiuj.springcloud.page.initvo;
import com.axiuj.springcloud.restaurantconsumer.service.OrderitemConsumerService;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @创建人 axiuj
 * @创建时间 2019/3/21
 * @描述
 */
@RestController
public class OrderitemConsumerController {
    @Autowired
    private OrderitemConsumerService service;
    @PostMapping("/list")
    public List<Orderitem> list(){
        return service.list();
    }
    @PostMapping("/delete")
    public int delete(@RequestBody Orderitem orderitem){
        return service.delete(orderitem);
    }

    @PostMapping("/add")
    public APIResponse add(@RequestBody Ordervo ordervo){
        return service.add(ordervo);
    }

    @PostMapping("/get")
    public Orderitem get(@RequestBody Orderitem orderitem){
        return service.get(orderitem);
    }

    @PostMapping("/updata")
    public int updata(@RequestBody Orderitem orderitem){
        return service.updata(orderitem);
    }
    @PostMapping("/init")
    public APIResponse initordertable(@RequestBody initvo initvo){
        if (initvo.getPagedata()==null){
            return APIResponse.other(507,"未获得页面数据1",null);
        }
        if (initvo.getStoreid()==0){
            return APIResponse.other(508,"未获得页面数据2",null);
        }
        return service.init(initvo);
    }
    @PostMapping("/checkout")
    public APIResponse checkout(@RequestBody Orderform orderform){
        if (orderform.getStatus()!=1){
            return APIResponse.other(511,"数据不符合规范",null);
        }
        return service.checkout(orderform);
    }
    @PostMapping("/upprder")
    public APIResponse upprder(@RequestBody List<Orderitem> orderitems){
        if (orderitems==null){
            return APIResponse.other(512,"输入数据为空",null);
        }
        return service.uporder(orderitems);
    }
}

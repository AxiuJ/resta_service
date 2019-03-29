package com.axiuj.springcloud.providerorderitem.controller;

import com.axiuj.springcloud.model.entity.Orderitem;
import com.axiuj.springcloud.providerorderitem.service.OrderitemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.POST;
import java.util.List;

/**
 * @创建人 axiuj
 * @创建时间 2019/3/20
 * @描述
 */
@RestController
public class OrderitemController {

    @Autowired
    private OrderitemService service;
    @PostMapping("/list")
    public List<Orderitem> list(){
        return service.list();
    };
    @PostMapping("/delete")
    public int delete(@RequestBody Orderitem orderitem){

        return service.delete(orderitem.getItemId());
    };
    @PostMapping("/get")
    public Orderitem get(@RequestBody Orderitem orderitem){
        return service.get(orderitem.getItemId());
    };
    @PostMapping("/add")
    public int add(@RequestBody List<Orderitem> orderitems){
        return service.add(orderitems);
    };
    @PostMapping("/updata")
    public int updata(@RequestBody Orderitem orderitem){
        return service.updata(orderitem);
    };
    @PostMapping("/findbyin")
    public List<Orderitem> findbyin(@RequestBody List<Integer> list){
        return service.findbyin(list);
    }

    @PostMapping("/uporders")
    public int uporders(@RequestBody List<Orderitem> Orderitems){
        return service.uporders(Orderitems);
    };
}

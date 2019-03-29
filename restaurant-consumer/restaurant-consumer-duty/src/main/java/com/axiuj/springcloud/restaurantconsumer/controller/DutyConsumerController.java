package com.axiuj.springcloud.restaurantconsumer.controller;

import com.axiuj.springcloud.model.entity.Duty;
import com.axiuj.springcloud.restaurantconsumer.service.DutyConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @创建人 axiuj
 * @创建时间 2019/2/1
 * @描述
 */
@RestController
public class DutyConsumerController {
    @Autowired
    private DutyConsumerService service;
    @PostMapping ("/list")
    public List<Duty> list(){
        return service.list();
    }
    @PostMapping("/delete")
    public int delete(@RequestParam(value = "dutyId",defaultValue = "0") long dutyId){
        return service.delete(dutyId);
    }

    @PostMapping("/add")
    public int add(Duty duty){
        return service.add(duty);
    }

    @PostMapping("/get")
    public Duty get(@RequestParam(value = "dutyId",defaultValue = "0") long dutyId){
        return service.get(dutyId);
    }

    @PostMapping("/updata")
    public int updata(Duty duty){
        return service.updata(duty);
    }
}


package com.axiuj.springcloud.providerduty.controller;

import com.axiuj.springcloud.model.entity.Duty;
import com.axiuj.springcloud.providerduty.service.DutyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @创建人 axiuj
 * @创建时间 2019/2/1
 * @描述
 */
@RestController
public class DutyController {

    @Autowired
    private DutyService service;
    @PostMapping("/list")
    public List<Duty> list(){
        return service.list();
    };
    @PostMapping("/delete")
    public int delete(Integer dutyId){
        return service.delete(dutyId);
    };
    @PostMapping("/get")
    public Duty get(Integer dutyId){
        return service.get(dutyId);
    };
    @PostMapping("/add")
    public int add(Duty duty){
        return service.add(duty);
    };
    @PostMapping("/updata")
    public int updata(Duty duty){
        return service.updata(duty);
    };
}


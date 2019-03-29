package com.axiuj.springcloud.restaurantconsumer.controller;


import ch.qos.logback.core.net.SyslogOutputStream;
import com.axiuj.springcloud.Api.APIResponse;
import com.axiuj.springcloud.Req.Requser;
import com.axiuj.springcloud.model.entity.Staff;
import com.axiuj.springcloud.page.PageData;
import com.axiuj.springcloud.restaurantconsumer.entity.StaffVo;
import com.axiuj.springcloud.restaurantconsumer.service.StaffConsumerService;
import com.axiuj.springcloud.restaurantconsumer.util.Info;
import com.axiuj.springcloud.restaurantconsumer.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @创建人 axiuj
 * @创建时间 2019/1/27
 * @描述
 */
@RestController
public class StaffConsumerController {

    @Autowired
    private StaffConsumerService service;
    @PostMapping("/list")
    public List<Staff> list(){
        return service.list();
    }
    @PostMapping("/delete")
    public int delete(@RequestParam(value = "staffId",defaultValue = "0") long staffId){
        System.out.println(staffId);
        return service.delete(staffId);
    }

    @PostMapping("/add")
    public int add(@RequestBody Staff staff){
        return service.add(staff);
    }

    @PostMapping("/get")
    public Staff get(@RequestParam(value = "staffId",defaultValue = "0") long staffId){
        System.out.println(staffId);
        return service.get(staffId);
    }

    @PostMapping("/updata")
    public int updata(@RequestBody Staff staff){
        return service.updata(staff);
    }

    @PostMapping("/login")
    public APIResponse<User> login(@RequestBody Requser reqUser){
        return service.login(reqUser);
    }
    @PostMapping("/info")
    public APIResponse<Info> info(@RequestBody Staff staff){
        System.out.println("SDF"+staff.getStaffId());
        return service.info(staff.getStaffId());
    }
    @PostMapping("/page")
    public APIResponse pageliststaff(@RequestBody PageData page){
        return service.page(page);
    }

    @PostMapping("/getdutyname")
    public APIResponse getdutyname(){
        return service.getdutyname();
    }

    @PostMapping("/updatausable")
    public APIResponse updatausable(@RequestBody Staff staff){
        return service.updatausable(staff);
    }
}

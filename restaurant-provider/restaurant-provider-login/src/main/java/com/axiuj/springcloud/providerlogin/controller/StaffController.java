package com.axiuj.springcloud.providerlogin.controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.axiuj.springcloud.model.entity.Staff;
import com.axiuj.springcloud.page.PageData;
import com.axiuj.springcloud.providerlogin.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @创建人 axiuj
 * @创建时间 2019/1/24
 * @描述
 */
@RestController
public class StaffController {

    @Autowired
    private StaffService service;
    @PostMapping("/list")
    public List<Staff> list(@RequestBody PageData pageData){
        return service.list( pageData);
    };
    @PostMapping("/delete")
    public int delete(@RequestParam(value = "staffId",defaultValue = "0")Integer staffId){
        System.out.println(staffId);
        return service.delete(staffId);
    };
    @PostMapping("/get")
    public Staff get(@RequestParam(value = "staffId",defaultValue = "0") Integer staffId){
        return service.get(staffId);
    };
    @PostMapping("/add")
    public int add(@RequestBody Staff staff){
        return service.add(staff);
    };
    @PostMapping("/updata")
    public int updata(@RequestBody Staff staff){
        return service.updata(staff);
    };
    @PostMapping("/search")
    public List<Staff> search(@RequestBody Staff staff){
        return service.search(staff);
    }
    @PostMapping("/page")
    private List<Staff> pagelist(@RequestBody PageData pageData){
        return service.pagelist(pageData);
    }
    @PostMapping("/updatadelete")
    private int updatadelete(@RequestBody Staff staff){
        return service.updatausable(staff);
    }
}

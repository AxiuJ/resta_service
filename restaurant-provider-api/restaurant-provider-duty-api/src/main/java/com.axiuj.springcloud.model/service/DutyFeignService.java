package com.axiuj.springcloud.model.service;

import com.axiuj.springcloud.model.entity.Duty;
import com.axiuj.springcloud.model.service.hystrix.DutyFeignServiceHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


/**
 * @创建人 axiuj
 * @创建时间 2019/2/1
 * @描述
 */
@FeignClient(value = "restaurant-procider-duty",fallbackFactory = DutyFeignServiceHystrix.class)
public interface DutyFeignService {
    @PostMapping(value = "/list")
    public List<Duty> list();

    @PostMapping("/delete")
    public int delete(@RequestParam(value = "dutyId",defaultValue = "0") long dutyId);

    @PostMapping("/get")
    public Duty get(@RequestParam(value = "dutyId",defaultValue = "0") long dutyId);

    @PostMapping("/add")
    public int add(@RequestBody Duty duty);

    @PostMapping("/updata")
    public int updata(@RequestBody Duty duty);
}


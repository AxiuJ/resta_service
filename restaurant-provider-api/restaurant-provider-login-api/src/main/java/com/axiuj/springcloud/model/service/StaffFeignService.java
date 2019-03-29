package com.axiuj.springcloud.model.service;

import com.axiuj.springcloud.model.entity.Staff;
import com.axiuj.springcloud.model.service.hystrix.StaffFeignServiceHystrix;
import com.axiuj.springcloud.page.PageData;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import javax.naming.ldap.PagedResultsControl;
import java.util.List;

/**
 * @创建人 axiuj
 * @创建时间 2019/1/23
 * @描述
 */

@FeignClient(value = "restaurant-procider-staff",fallbackFactory = StaffFeignServiceHystrix.class)
public interface StaffFeignService {
    @PostMapping(value = "/list")
    public List<Staff> list(@RequestBody PageData pageData);

    @PostMapping("/delete")
    public int delete(@RequestParam(value = "staffId",defaultValue = "0") long storeId);

    @PostMapping("/get")
    public Staff get(@RequestParam(value = "staffId",defaultValue = "0") long storeId);

    @PostMapping("/add")
    public int add(@RequestBody Staff store);

    @PostMapping("/updata")
    public int updata(@RequestBody Staff store);

    @PostMapping("/search")
    public List<Staff> search(@RequestBody Staff store);

    @PostMapping("/page")
    public List<Staff> page(@RequestBody PageData pageData);

    @PostMapping("/updatadelete")
    public int updatadelete(@RequestBody Staff staff);
}

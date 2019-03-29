package com.axiuj.springcloud.restaurantconsumer.service;

import com.axiuj.springcloud.Api.APIResponse;
import com.axiuj.springcloud.Req.Requser;
import com.axiuj.springcloud.model.entity.Duty;
import com.axiuj.springcloud.model.entity.Staff;
import com.axiuj.springcloud.page.PageData;
import com.axiuj.springcloud.page.pageutil;
import com.netflix.discovery.endpoint.EndpointUtils;

import java.util.List;

/**
 * @创建人 axiuj
 * @创建时间 2019/1/27
 * @描述
 */

public interface StaffConsumerService {
    public List<Staff> list();

    public int delete(long staffId);

    public Staff get(long staffId);

    public int add(Staff staff);

    public int updata(Staff staff);

    public APIResponse login(Requser requser);

    public APIResponse info(long staffId);

    APIResponse<pageutil<Staff>> page(PageData pageData);

    APIResponse<pageutil<Duty>> getdutyname();

    APIResponse updatausable(Staff staff);
}

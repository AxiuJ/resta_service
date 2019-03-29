package com.axiuj.springcloud.restaurantconsumer.service;

import com.axiuj.springcloud.model.entity.Duty;

import java.util.List;

/**
 * @创建人 axiuj
 * @创建时间 2019/2/1
 * @描述
 */
public interface DutyConsumerService {
    public List<Duty> list();

    public int delete(long dutyId);

    public Duty get(long dutyId);

    public int add(Duty duty);

    public int updata(Duty duty);
}


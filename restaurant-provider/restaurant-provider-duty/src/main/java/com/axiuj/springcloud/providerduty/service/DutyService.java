package com.axiuj.springcloud.providerduty.service;

import com.axiuj.springcloud.model.entity.Duty;

import java.util.List;

/**
 * @创建人 axiuj
 * @创建时间 2019/2/1
 * @描述
 */
public interface DutyService {
    public List<Duty> list();

    public int delete(Integer dutyId);

    public Duty get(Integer dutyId);

    public int add(Duty duty);

    public int updata(Duty duty);
}


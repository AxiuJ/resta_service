package com.axiuj.springcloud.providerduty.service.impl;

import com.axiuj.springcloud.model.entity.Duty;
import com.axiuj.springcloud.providerduty.dao.DutyDao;
import com.axiuj.springcloud.providerduty.service.DutyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @创建人 axiuj
 * @创建时间 2019/2/1
 * @描述
 */
@Service
public class DutyServiceImpl implements DutyService {
    @Autowired
    private DutyDao dao;

    @Override
    public List<Duty> list() {
        return dao.list();
    }

    @Override
    public int delete(Integer dutyId) {
        return dao.delete(dutyId);
    }

    @Override
    public int add(Duty duty) {
        return dao.add(duty);
    }

    public Duty get(Integer dutyId) {
        return dao.get(dutyId);
    }

    @Override
    public int updata(Duty duty) {
        return dao.updata(duty);
    }
}
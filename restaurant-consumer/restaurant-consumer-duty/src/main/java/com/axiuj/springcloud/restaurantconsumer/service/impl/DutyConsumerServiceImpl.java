package com.axiuj.springcloud.restaurantconsumer.service.impl;

import com.axiuj.springcloud.model.entity.Duty;
import com.axiuj.springcloud.model.service.DutyFeignService;
import com.axiuj.springcloud.restaurantconsumer.service.DutyConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @创建人 axiuj
 * @创建时间 2019/2/1
 * @描述
 */
@Service
public class DutyConsumerServiceImpl implements DutyConsumerService {
    @Autowired

    private DutyFeignService dutyFeignService;
    @Override
    public List<Duty> list() {
        return dutyFeignService.list();
    }

    @Override
    public int delete(long dutyId) {
        return dutyFeignService.delete(dutyId);
    }

    @Override
    public int add(Duty duty) {
        return dutyFeignService.add(duty);
    }

    @Override
    public Duty get(long dutyId) {
        return dutyFeignService.get(dutyId);
    }

    @Override
    public int updata(Duty duty){
        return dutyFeignService.updata(duty);
    }


}


package com.axiuj.springcloud.providerduty.dao;

import com.axiuj.springcloud.model.entity.Duty;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @创建人 axiuj
 * @创建时间 2019/2/1
 * @描述
 */
@Mapper
public interface DutyDao {

    public List<Duty> list();

    public int delete(Integer dutyId);

    public Duty get(Integer dutyId);

    public int add(Duty duty);

    public int updata(Duty duty);
}


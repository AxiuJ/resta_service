package com.axiuj.springcloud.providerorderform.dao;

import com.axiuj.springcloud.ChartData.Chartdata;
import com.axiuj.springcloud.model.entity.Orderform;
import com.axiuj.springcloud.page.initvo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @创建人 axiuj
 * @创建时间 2019/3/20
 * @描述
 */
@Mapper
public interface OrderformDao {

    public List<Orderform> list();

    public int delete(Integer orderformId);

    public Orderform get(Integer orderformId);

    public int add(Orderform orderform);

    public int updata(Orderform orderform);

    public List<Orderform> init (initvo initvo);

    public List<Orderform> findbypagesize(initvo initvo);

    public int checkout(Orderform orderform);

    public List<Chartdata> getchartdata(Orderform orderform);
}


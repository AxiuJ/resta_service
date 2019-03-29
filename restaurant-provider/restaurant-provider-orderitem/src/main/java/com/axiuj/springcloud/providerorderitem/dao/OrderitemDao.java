package com.axiuj.springcloud.providerorderitem.dao;

import com.axiuj.springcloud.model.entity.Orderitem;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @创建人 axiuj
 * @创建时间 2019/3/20
 * @描述
 */
@Mapper
public interface OrderitemDao {

    public List<Orderitem> list();

    public int delete(Integer orderitemId);

    public Orderitem get(Integer orderitemId);

    public int add(List<Orderitem> orderitems);

    public int updata(Orderitem orderitem);

    public List<Orderitem> findbyin(List list);

    public int uporders(List<Orderitem> list);
}

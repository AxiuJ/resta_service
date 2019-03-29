package com.axiuj.springcloud.restaurantconsumer.service.impl;

import com.axiuj.springcloud.Api.APIResponse;
import com.axiuj.springcloud.model.entity.Orderform;
import com.axiuj.springcloud.model.entity.Orderitem;
import com.axiuj.springcloud.model.service.OrderformFeignService;
import com.axiuj.springcloud.model.service.OrderitemFeignService;
import com.axiuj.springcloud.page.pageutil;
import com.axiuj.springcloud.restaurantconsumer.entity.Itemvo;
import com.axiuj.springcloud.restaurantconsumer.entity.Ordervo;
import com.axiuj.springcloud.page.initvo;
import com.axiuj.springcloud.restaurantconsumer.service.OrderitemConsumerService;
import com.axiuj.springcloud.restaurantconsumer.util.OrderUtil;
import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ListFactoryBean;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @创建人 axiuj
 * @创建时间 2019/3/21
 * @描述
 */
@Service
public class OrderitemConsumerServiceImpl implements OrderitemConsumerService {
    @Autowired

    private OrderitemFeignService orderitemFeignService;
    @Autowired
    private OrderformFeignService orderformFeignService;
    private OrderUtil util = new OrderUtil();
    @Override
    public List<Orderitem> list() {
        return orderitemFeignService.list();
    }

    @Override
    public int delete(Orderitem orderitem) {
        return orderitemFeignService.delete(orderitem);
    }

    @Override
    public APIResponse add(Ordervo ordervo) {
        int orderid = orderformFeignService.add(ordervo.getOrderform());
        if (orderid!=0) {
            util.addorderid(ordervo.getFoods(),orderid);
            int item=orderitemFeignService.add(ordervo.getFoods());
            if (item==0) {
                return APIResponse.other(506,"下单失败：单号以及生成",null);
            }
        }else{
            return APIResponse.other(508,"下单失败：单号未生成",null);
        }
        return APIResponse.success(orderid);
    }

    @Override
    public Orderitem get(Orderitem orderitem) {
        return orderitemFeignService.get(orderitem);
    }

    @Override
    public int updata(Orderitem orderitem){
        return orderitemFeignService.updata(orderitem);
    }

    @Override
    public APIResponse init(initvo initvo) {
        pageutil<Itemvo> page = new pageutil()
                .setCurrPage(initvo.getPagedata().getCurrent())
                .setPageSize(initvo.getPagedata().getPagesize());
        List<Orderform> listf = orderformFeignService.findbypage(initvo);
        if (listf.size()==0){
            return APIResponse.other(508,"查询订单时出错",null);
        }
        List<Integer> orderidlist = util.getorderidlist(listf);
        List<Orderitem> listi = orderitemFeignService.findbyin(orderidlist);
        if (listi.size()==0){
            return APIResponse.other(509,"查询订单详情时出错",null);
        }
        List<Itemvo> itemvos = util.getitemvos(listf,listi);
        page.setTolalCount(orderformFeignService.findbypagesize(initvo));
        page.setList(itemvos);
        return APIResponse.success(page);
    }

    @Override
    public APIResponse checkout(Orderform orderform) {
        int item = orderformFeignService.checkout(orderform);
        if (item==0){
            return APIResponse.other(510,"失败未找到需要修改的内容",null);
        }
        return APIResponse.success();
    }

    @Override
    public APIResponse uporder(List<Orderitem> orderitems) {
        int item = orderitemFeignService.uporders(orderitems);
        Orderform orderform =new Orderform();
        if (item!=1){
            return APIResponse.other(512,"更新失败1",null);
        }
        orderform.setOrderformId(orderitems.get(0).getOrderId())
                .setPrice(util.getprice(orderitems));
        int i = orderformFeignService.updata(orderform);
        if (i!=1){
            return APIResponse.other(513,"更新失败2",null);
        }
        return APIResponse.success();
    }
}


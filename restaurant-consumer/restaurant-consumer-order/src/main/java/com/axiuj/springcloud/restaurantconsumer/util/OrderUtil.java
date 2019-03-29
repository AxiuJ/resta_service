package com.axiuj.springcloud.restaurantconsumer.util;

import com.axiuj.springcloud.model.entity.Orderform;
import com.axiuj.springcloud.model.entity.Orderitem;
import com.axiuj.springcloud.restaurantconsumer.entity.Itemvo;
import jdk.nashorn.internal.objects.annotations.Where;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @创建人 axiuj
 * @创建时间 2019/3/21
 * @描述
 */
public class OrderUtil {

    public double getprice(List<Orderitem> list){
        Iterator<Orderitem> iterator = list.iterator();
        Orderitem item = new Orderitem();
        double T =0;
        while (iterator.hasNext()){
            item= iterator.next();
            T=item.getNum()*item.getPrice()+T;
        }
        return T;
    }

    public List<Itemvo> getitemvos(List<Orderform> listf,List<Orderitem> listi){
        List<Itemvo> arr = new ArrayList();
        for (Orderform f : listf){
            Itemvo item = new Itemvo();
            List<Orderitem> orderitems = new ArrayList<>();
            item.setOrderform(f);
            for (Orderitem i : listi){
                if (f.getOrderformId()==i.getOrderId()){
                    orderitems.add(i);
                }
            }
            item.setOrderitems(orderitems);
            arr.add(item);
        }

        return arr;
    }

    public List getorderidlist(List<Orderform> listf){
        List arr = new ArrayList();
        Iterator<Orderform> iterator = listf.iterator();
        while (iterator.hasNext()){
            arr.add(iterator.next().getOrderformId());
        }
        return arr;
    }

    public List<Orderitem> addorderid(List<Orderitem> ois,int orderid){
        Iterator<Orderitem> iterator = ois.iterator();
        Orderitem item = new Orderitem();
        while (iterator.hasNext()){
            item=iterator.next();
            item.setOrderId(orderid);
            item.setTotalfee(item.getNum()*item.getPrice());
        }

        return ois;
    }
}

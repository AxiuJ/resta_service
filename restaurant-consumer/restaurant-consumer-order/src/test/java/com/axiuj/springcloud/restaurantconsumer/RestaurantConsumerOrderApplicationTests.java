package com.axiuj.springcloud.restaurantconsumer;

import com.axiuj.springcloud.model.entity.Orderform;
import com.axiuj.springcloud.model.entity.Orderitem;
import com.axiuj.springcloud.restaurantconsumer.entity.Ordervo;
import com.axiuj.springcloud.restaurantconsumer.service.OrderitemConsumerService;
import com.axiuj.springcloud.restaurantconsumer.util.OrderUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RestaurantConsumerOrderApplicationTests {
    private OrderUtil u =new OrderUtil();
    @Autowired
    private OrderitemConsumerService service;
    @Test
    public void contextLoads() {
        List<Orderitem> ois = new ArrayList<>();
        ois.add(new Orderitem().setFoodName("A").setTotalfee(800.8).setPrice(70).setMenusId(1000).setNum(10));
        ois.add(new Orderitem().setFoodName("B").setTotalfee(800.8).setPrice(70).setMenusId(1000).setNum(10));
        ois.add(new Orderitem().setFoodName("C").setTotalfee(800.8).setPrice(70).setMenusId(1000).setNum(10));
        ois.add(new Orderitem().setFoodName("D").setTotalfee(800.8).setPrice(70).setMenusId(1000).setNum(10));
        ois.add(new Orderitem().setFoodName("E").setTotalfee(800.8).setPrice(70).setMenusId(1000).setNum(10));
        u.addorderid(ois,20);
        System.out.println(ois);
    }
    @Test
    public void addor(){
        Ordervo s = new Ordervo();
        List<Orderitem> ois = new ArrayList<>();
        ois.add(new Orderitem().setFoodName("A").setTotalfee(800.8).setPrice(70).setMenusId(1000).setNum(10));
        ois.add(new Orderitem().setFoodName("B").setTotalfee(800.8).setPrice(70).setMenusId(1000).setNum(10));
        ois.add(new Orderitem().setFoodName("C").setTotalfee(800.8).setPrice(70).setMenusId(1000).setNum(10));
        ois.add(new Orderitem().setFoodName("D").setTotalfee(800.8).setPrice(70).setMenusId(1000).setNum(10));
        ois.add(new Orderitem().setFoodName("E").setTotalfee(800.8).setPrice(70).setMenusId(1000).setNum(10));
        s.setFoods(ois);
        s.setOrderform(new Orderform().setDeskId("a18").setPrice(70).setStaffName("77").setStaffId(7));
        service.add(s);

    }

}

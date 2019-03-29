package com.axiuj.springcloud.providerorderitem;

import com.axiuj.springcloud.model.entity.Orderitem;
import com.axiuj.springcloud.providerorderitem.service.OrderitemService;
import org.ietf.jgss.Oid;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RestaurantProviderOrderitemApplicationTests {
    @Autowired
    private OrderitemService service;

    @Test
    public void contextLoads() {
        List<Orderitem> ois = new ArrayList<>();
        ois.add(new Orderitem().setFoodName("A").setTotalfee(800.8).setPrice(70).setMenusId(1000).setNum(10).setOrderId(7));
        ois.add(new Orderitem().setFoodName("B").setTotalfee(800.8).setPrice(70).setMenusId(1000).setNum(10).setOrderId(7));
        ois.add(new Orderitem().setFoodName("C").setTotalfee(800.8).setPrice(70).setMenusId(1000).setNum(10).setOrderId(7));
        ois.add(new Orderitem().setFoodName("D").setTotalfee(800.8).setPrice(70).setMenusId(1000).setNum(10).setOrderId(7));
        ois.add(new Orderitem().setFoodName("E").setTotalfee(800.8).setPrice(70).setMenusId(1000).setNum(10).setOrderId(7));
        service.add(ois);
    }

}

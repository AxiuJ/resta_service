package com.axiuj.springcloud.providerorderform;

import com.axiuj.springcloud.model.entity.Orderform;
import com.axiuj.springcloud.providerorderform.service.OrderformService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RestaurantProviderOrderformApplicationTests {
    @Autowired
    private OrderformService serive;
    @Test
    public void contextLoads() {
        System.out.println(serive.getchartdata(new Orderform().setStoreId(10000)));
    }

}

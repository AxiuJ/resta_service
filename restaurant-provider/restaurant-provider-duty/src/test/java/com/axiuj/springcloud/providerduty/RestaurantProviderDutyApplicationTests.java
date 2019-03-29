package com.axiuj.springcloud.providerduty;

import com.axiuj.springcloud.providerduty.dao.DutyDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RestaurantProviderDutyApplicationTests {
    @Autowired
    private DutyDao dao;
    @Test
    public void contextLoads() {
        System.out.println(dao.list());
    }

}


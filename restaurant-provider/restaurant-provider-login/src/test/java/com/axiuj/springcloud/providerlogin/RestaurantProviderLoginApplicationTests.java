package com.axiuj.springcloud.providerlogin;

import com.axiuj.springcloud.model.entity.Staff;
import com.axiuj.springcloud.page.PageData;
import com.axiuj.springcloud.providerlogin.service.StaffService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RestaurantProviderLoginApplicationTests {
    @Autowired
    private StaffService service;
    @Test
    public void contextLoads() {
        PageData pa = new PageData(1,10,"");
        List<Staff> s=service.pagelist(pa);
        System.out.println(s.size());
    }

}


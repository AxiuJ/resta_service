package com.axiuj.springcloud.restaurantconsumer.controller;

import com.axiuj.springcloud.Api.APIResponse;
import com.axiuj.springcloud.model.entity.Orderform;
import com.axiuj.springcloud.restaurantconsumer.service.ChartConsumerService;
import javafx.scene.chart.Chart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @创建人 axiuj
 * @创建时间 2019/3/19
 * @描述
 */
@RestController
public class ChartConsumerController {
    @Autowired
    private ChartConsumerService service;
    @PostMapping("/getchartdata")
    public APIResponse getchartdata(@RequestBody Orderform orderform){
        if (orderform.getStoreId()==0){
            return APIResponse.fail();
        }
        return service.getchardata(orderform);
    };
}

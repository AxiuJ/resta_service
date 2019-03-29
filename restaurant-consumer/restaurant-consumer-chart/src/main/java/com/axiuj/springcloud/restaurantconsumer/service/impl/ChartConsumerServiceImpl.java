package com.axiuj.springcloud.restaurantconsumer.service.impl;

import com.axiuj.springcloud.Api.APIResponse;
import com.axiuj.springcloud.ChartData.Chartdata;
import com.axiuj.springcloud.model.entity.Orderform;
import com.axiuj.springcloud.model.service.MenusFeignService;
import com.axiuj.springcloud.model.service.OrderformFeignService;
import com.axiuj.springcloud.restaurantconsumer.service.ChartConsumerService;
import com.axiuj.springcloud.restaurantconsumer.util.ChartUtil;
import javafx.scene.chart.Chart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

/**
 * @创建人 axiuj
 * @创建时间 2019/3/19
 * @描述
 */
@Service
public class ChartConsumerServiceImpl implements ChartConsumerService {

    @Autowired
    private OrderformFeignService orderformFeignService;
    private ChartUtil util =new ChartUtil();
    @Override
    public APIResponse getchardata(Orderform orderform) {
        List<Chartdata> item = orderformFeignService.getchartdata(orderform);

        return APIResponse.success(util.getchartvo(item));
    }
}

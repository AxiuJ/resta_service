package com.axiuj.springcloud.restaurantconsumer.service;

import com.axiuj.springcloud.Api.APIResponse;
import com.axiuj.springcloud.model.entity.Orderform;
import javafx.scene.chart.Chart;

import java.util.List;

/**
 * @创建人 axiuj
 * @创建时间 2019/3/19
 * @描述
 */
public interface ChartConsumerService {
    public APIResponse getchardata(Orderform orderform);
}

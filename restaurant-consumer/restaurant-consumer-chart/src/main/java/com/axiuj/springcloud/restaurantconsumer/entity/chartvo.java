package com.axiuj.springcloud.restaurantconsumer.entity;

import javafx.scene.effect.SepiaTone;
import lombok.Data;

import java.util.List;
import java.util.Set;

/**
 * @创建人 axiuj
 * @创建时间 2019/3/25
 * @描述
 */
@Data
public class chartvo {
    private String name;
    private double[] totals =new double[31];
}

package com.axiuj.springcloud.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @创建人 axiuj
 * @创建时间 2019/3/20
 * @描述
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Orderitem {
    private int ItemId;
    private int MenusId;
    private int OrderId;
    private String FoodName;
    private double Price;
    private int Num;
    private double Totalfee;
}

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
public class Orderform {
    private int OrderformId;
    private int StoreId;
    private String DeskId;
    private String StaffName;
    private int StaffId;
    private double Price;
    private int Status;//状态
    private String CreateTime;
    private String SettleTime;
}

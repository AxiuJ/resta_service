package com.axiuj.springcloud.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @创建人 axiuj
 * @创建时间 2019/2/11
 * @描述
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Menus {
    /**
     * 菜品id
     */
    private int MenusId;
    /**
     * 店铺id
     */
    private int StoreId;
    /**
     * 类别id
     */
    private int CategoryId;
    /**
     * 类别名
     */
    private String CategoryName;
    /**
     * 创建人id
     */
    private int CreateStaffId;
    /**
     * 菜单名字
     */
    private String FoodName;
    /**
     * 价格
     */
    private double Price;
    /**
     * 创建时间
     */
    private String CreateTime;
    /**
     * 删除标记
     */
    private int Usable;

}

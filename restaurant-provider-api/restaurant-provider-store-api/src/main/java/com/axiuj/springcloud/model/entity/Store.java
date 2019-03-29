package com.axiuj.springcloud.model.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;


/**
 * @创建人 axiuj
 * @创建时间 2019/1/14
 * @描述
 * @author
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Store {
    /**
     * 店铺id
     */
    private long StoreId;
    /**
     * 店铺名称
     */
    private String StoreName;
    /**
     * 所在位置
     */
    private String StoreAddress;
    /**
     * 创建时间
     */
    private String CreateTime;
    /**
     * 删除标记
     */
    private int Usable;
}

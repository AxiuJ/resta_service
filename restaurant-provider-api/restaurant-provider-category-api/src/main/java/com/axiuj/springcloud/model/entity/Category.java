package com.axiuj.springcloud.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @创建人 axiuj
 * @创建时间 2019/2/7
 * @描述
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Category {
    /**
     * 类别id
     */
    private int CategoryId;
    /**
     * 类别名称
     */
    private String CategoryName;
    /**
     * 创建时间
     */
    private String CreateTime;
    /**
     * 创建人
     */
    private int CreateStaffId;
    /**
     * 删除标记
     */
    private int Usable;
}

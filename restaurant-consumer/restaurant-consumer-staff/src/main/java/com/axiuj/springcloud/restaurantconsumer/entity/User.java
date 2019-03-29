package com.axiuj.springcloud.restaurantconsumer.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @创建人 axiuj
 * @创建时间 2019/2/13
 * @描述
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class User {
    private int staffid;
    private String name;
    private String token;
    private String sex;
    private int storeid;
    private String storename;
}

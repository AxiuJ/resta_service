package com.axiuj.springcloud.restaurantconsumer.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * @创建人 axiuj
 * @创建时间 2019/2/14
 * @描述
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Info {
    private List<String> role;
    private String token;
    private String introduction;
    private String name;
    private int uid;
}

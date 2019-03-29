package com.axiuj.springcloud.Req;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @创建人 axiuj
 * @创建时间 2019/2/14
 * @描述
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Requser {
    private String username;
    private String password;
}


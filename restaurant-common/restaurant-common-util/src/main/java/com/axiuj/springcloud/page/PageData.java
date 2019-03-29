package com.axiuj.springcloud.page;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @创建人 axiuj
 * @创建时间 2019/2/23
 * @描述
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageData {
    private int current;
    private int pagesize;
    private String seach;
}

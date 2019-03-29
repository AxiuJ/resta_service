package com.axiuj.springcloud.page;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * @创建人 axiuj
 * @创建时间 2019/1/23
 * @描述
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class pageutil<T> {
    /**
     * 起始记录数
     */
    private int currPage;
    /**
     * 每页显示的记录数
     */
    private int pageSize;
    /**
     * 总记录数
     */
    private int tolalCount;
    /**
     * 保存分页查找到的记录
     */
    private List<T> list;
}

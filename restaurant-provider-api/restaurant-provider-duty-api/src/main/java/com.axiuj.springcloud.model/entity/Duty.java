package com.axiuj.springcloud.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.omg.CORBA.PRIVATE_MEMBER;

/**
 * @创建人 axiuj
 * @创建时间 2019/1/31
 * @描述
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Duty {
    /**
     * 职务id
     */
    private int DutyId;
    /**
     * 职务名称
     */
    private String DutyName;
    /**
     * 创建时间
     */
    private String CreateTime;
    /**
     * 删除标记
     */
    private int Usable;
}

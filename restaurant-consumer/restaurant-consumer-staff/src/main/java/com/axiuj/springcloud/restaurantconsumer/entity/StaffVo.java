package com.axiuj.springcloud.restaurantconsumer.entity;

import com.axiuj.springcloud.model.entity.Duty;
import com.axiuj.springcloud.model.entity.Staff;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @创建人 axiuj
 * @创建时间 2019/2/19
 * @描述
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class StaffVo {
    private int staffId;
    private String name;
    private String sex;
    private String address;
    private String duty;

    public StaffVo(Staff staff, Duty duty) {
        this.name=staff.getStaffName();
        this.sex =staff.getStaffSex();
        this.duty=duty.getDutyName();
        this.address=staff.getAddress();
    }

}

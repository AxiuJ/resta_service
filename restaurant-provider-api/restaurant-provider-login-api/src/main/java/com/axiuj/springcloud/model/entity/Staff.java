package com.axiuj.springcloud.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;


/**
 * @创建人 axiuj
 * @创建时间 2019/1/23
 * @描述
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Staff {
    /**
     * 人员id
     */
    private int StaffId;
    /**
     * 用户名
     */
    private String UserName;
    /**
     * 密码
     */
    private String PassWord;
    /**
     * 所属店铺id
     */
    private int StoreId;
    /**
     * 所属店铺名字
     */
    private String StoreName;
    /**
     * 创建者id
     */
    private int CreateId;
    /**
     * 创建者名字
     */
    private String CreateName;
    /**
     * 职称 权限
     */
    private int DutyId;
    /**
     * 职称
     */
    private String DutyName;
    /**
     * 人员姓名
     */
    private String StaffName;
    /**
     * 居住地
     */
    private String Address;
    /**
     * 人员性别
     */
    private String StaffSex;
    /**
     * 人员身份证号码
     */
    private String IdCardNo;
    /**
     * 联系电话
     */
    private String ContactNumber;
    /**
     * 创建时间
     */
    private String CreateTime;
    /**
     * 在职状态
     */
    private int DutyStatus;
    /**
     * 删除标记
     */
    private int Usable;

}

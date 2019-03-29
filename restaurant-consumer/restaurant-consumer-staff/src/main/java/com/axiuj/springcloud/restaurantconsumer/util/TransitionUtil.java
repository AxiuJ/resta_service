package com.axiuj.springcloud.restaurantconsumer.util;

import com.axiuj.springcloud.Req.Requser;
import com.axiuj.springcloud.model.entity.Staff;
import com.axiuj.springcloud.page.PageData;
import com.axiuj.springcloud.page.pageutil;
import com.axiuj.springcloud.restaurantconsumer.entity.StaffVo;
import com.axiuj.springcloud.restaurantconsumer.entity.User;
import org.omg.CORBA.INTERNAL;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @创建人 axiuj
 * @创建时间 2019/2/14
 * @描述
 */
public class TransitionUtil {
    /**
     * USER 转Staff
     * @param requser
     * @return
     */
    public static Staff UserToStaff(Requser requser){
        return new Staff().setUserName(requser.getUsername()).setPassWord(requser.getPassword());
    }

    /**
     * staff转user
     * @param staff
     * @param token
     * @return
     */
    public static User StaffToUser(Staff staff, String token){
        return new User()
                .setName(staff.getStaffName())
                .setToken(token)
                .setSex(staff.getStaffSex())
                .setStaffid(staff.getStaffId())
                .setStoreid(staff.getStoreId())
                .setStorename(staff.getStoreName());
    }

    /**
     * staff转info
     * @param staff
     * @param token
     * @return
     */
    public static Info StaffToInfo(Staff staff,String token){
        List<String> strings = new ArrayList<String>();
        strings.add(token);
        return new Info().setIntroduction(staff.getIdCardNo())
                .setName(staff.getStaffName())
                .setRole(strings)
                .setToken(token)
                .setUid(staff.getStaffId());
    }

    /**
     * 创建page信息
     * @param pageData
     * @param staff
     * @param total
     * @return
     */
    public static pageutil pagestaffvo(PageData pageData, List staff, int total){
        pageutil pageu = new pageutil().setTolalCount(total)
                .setCurrPage(pageData.getCurrent())
                //.setList(stafftostaffvo(staff))
                .setList(staff)
                .setPageSize(pageData.getPagesize());
        return pageu;
    }

    /**
     * staff转vo；
     * @param staff
     * @return

    public static List<StaffVo> stafftostaffvo(List staff){
        List<StaffVo> staffVos =new ArrayList<>();
        for (Iterator iterators = staff.iterator();iterators.hasNext();){
            Staff s = (Staff) iterators.next();
            staffVos.add(new StaffVo().setName(s.getStaffName())
                    .setAddress(s.getAddress())
                    .setDuty(s.getDutyName())
                    .setSex(s.getStaffSex())
                    .setStaffId(s.getStaffId()));
        }
        return staffVos;
    }*/
}

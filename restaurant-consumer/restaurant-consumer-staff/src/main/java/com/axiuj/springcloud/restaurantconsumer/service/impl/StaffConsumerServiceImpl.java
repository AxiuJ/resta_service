package com.axiuj.springcloud.restaurantconsumer.service.impl;

import com.axiuj.springcloud.Api.APIResponse;
import com.axiuj.springcloud.Req.Requser;
import com.axiuj.springcloud.model.entity.Duty;
import com.axiuj.springcloud.model.entity.Staff;
import com.axiuj.springcloud.model.service.DutyFeignService;
import com.axiuj.springcloud.model.service.StaffFeignService;
import com.axiuj.springcloud.page.PageData;
import com.axiuj.springcloud.page.pageutil;
import com.axiuj.springcloud.restaurantconsumer.service.StaffConsumerService;
import com.axiuj.springcloud.restaurantconsumer.util.TransitionUtil;
import jdk.management.resource.internal.TotalResourceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.PrivateKey;
import java.util.List;

/**
 * @创建人 axiuj
 * @创建时间 2019/1/27
 * @描述
 */
@Service
public class StaffConsumerServiceImpl implements StaffConsumerService {

    @Autowired
    private StaffFeignService staffFeignService;

    @Autowired
    private DutyFeignService dutyFeignService;

    @Override
    public List<Staff> list() {

        PageData p = new PageData();
        return staffFeignService.list(p);
    }

    @Override
    public int delete(long staffId) {
        return staffFeignService.delete(staffId);
    }

    @Override
    public Staff get(long staffId) {
        return staffFeignService.get(staffId);
    }

    @Override
    public int add(Staff staff) {
        int staffid=staffFeignService.add(staff);
        staff.setStaffId(staffid);
        System.out.println(staff);
        return staffFeignService.updata(staff);
    }

    @Override
    public int updata(Staff staff) {
        return staffFeignService.updata(staff);
    }

    @Override
    public APIResponse login(Requser requser) {
        List<Staff> list ;

        list = staffFeignService.search(TransitionUtil.UserToStaff(requser));
        if (list.size()!=1){
            return APIResponse.other(501,"没找到要搜索的数据",null);
        }
        Staff staff =list.get(0);
        String token = dutyFeignService.get(staff.getDutyId()).getDutyName();
        if (token.equals("")||token==null){
            return APIResponse.other(502,"不存在的职称",null);
        }

        return APIResponse.success(TransitionUtil.StaffToUser(staff,token));
    }

    @Override
    public APIResponse info(long staffId){
        Staff staff = staffFeignService.get(staffId);
        if (staff==null){
            return APIResponse.other(501,"没有找到",null);
        }
        String token = dutyFeignService.get(staff.getDutyId()).getDutyName();
        if (token.equals("")||token==null){
            return APIResponse.other(503,"不存在的职称",null);
        }
        return APIResponse.success(TransitionUtil.StaffToInfo(staff,token));
    }

    @Override
    public APIResponse<pageutil<Staff>> page(PageData pageData) {
        List<Staff> pagestaff = staffFeignService.page(pageData);
        int total = staffFeignService.list(pageData).size();
        return APIResponse.success(TransitionUtil.pagestaffvo(pageData,pagestaff,total));
    }

    @Override
    public APIResponse<pageutil<Duty>> getdutyname() {
        List<Duty> dutylist =dutyFeignService.list();
        return APIResponse.success(dutylist);
    }

    @Override
    public APIResponse updatausable(Staff staff) {
        System.out.println(staff.getStaffId());
        return APIResponse.success(staffFeignService.updatadelete(staff));
    }
}

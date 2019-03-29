package com.axiuj.springcloud.providerlogin.service.impl;

import com.axiuj.springcloud.model.entity.Staff;
import com.axiuj.springcloud.page.PageData;
import com.axiuj.springcloud.providerlogin.dao.StaffDao;
import com.axiuj.springcloud.providerlogin.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.support.SimpleTriggerContext;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @创建人 axiuj
 * @创建时间 2019/1/24
 * @描述
 */
@Service
public class StaffServiceImpl implements StaffService {

    @Autowired
    private StaffDao dao;

    @Override
    public List<Staff> list(PageData pageData) {
        return dao.list(pageData);
    }

    @Override
    public int delete(long staffId) {
        System.out.println(staffId);
        return dao.delete(staffId);
    }

    @Override
    public Staff get(long staffId) {
        return dao.get(staffId);
    }

    @Override
    public int add(Staff staff) {
        int i = dao.add(staff);
        return staff.getStaffId();
    }

    @Override
    public int updata(Staff staff) {
        System.out.println(staff.getStaffName());
        return dao.updata(staff);
    }

    @Override
    public List<Staff> search(Staff staff) {
        return dao.search(staff);
    }

    @Override
    public List<Staff> pagelist(PageData pageData) {
        return dao.pagelist(pageData);
    }

    @Override
    public int updatausable(Staff staff) {
        return dao.updatausable(staff);
    }
}

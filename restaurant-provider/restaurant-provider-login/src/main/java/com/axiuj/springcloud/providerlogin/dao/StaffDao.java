package com.axiuj.springcloud.providerlogin.dao;

import com.axiuj.springcloud.model.entity.Staff;
import com.axiuj.springcloud.page.PageData;
import jdk.nashorn.internal.runtime.logging.Logger;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @创建人 axiuj
 * @创建时间 2019/1/24
 * @描述
 */
@Mapper

public interface StaffDao {
    
    public List<Staff> list(PageData pageData);

    public int delete(long staffId);

    public Staff get(long staffId);

    public int add(Staff staff);

    public int updata(Staff staff);

    public List<Staff> search(Staff staff);

    public List<Staff> pagelist(PageData pageData);

    public int updatausable(Staff staff);

}

package com.axiuj.springcloud.model.service.hystrix;

import com.axiuj.springcloud.model.entity.Staff;
import com.axiuj.springcloud.model.service.StaffFeignService;
import com.axiuj.springcloud.page.PageData;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @创建人 axiuj
 * @创建时间 2019/1/23
 * @描述
 */
@Component
public class StaffFeignServiceHystrix implements FallbackFactory<StaffFeignService> {
    @Override
    public StaffFeignService create(Throwable throwable) {
        return new StaffFeignService() {
            @Override
            public List<Staff> list(PageData pageData) {
                return null;
            }

            @Override
            public int delete(long storeId) {
                return 0;
            }

            @Override
            public Staff get(long storeId) {
                return null;
            }

            @Override
            public int add(Staff store) {
                return 0;
            }

            @Override
            public int updata(Staff store) {
                return 0;
            }

            @Override
            public List<Staff> search(Staff store) {
                return null;
            }

            @Override
            public List<Staff> page(PageData pageData) {
                return null;
            }

            @Override
            public int updatadelete(Staff staff) {
                return 0;
            }
        };
    }
}

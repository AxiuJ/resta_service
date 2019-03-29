package com.axiuj.springcloud.model.service.hystrix;

import com.axiuj.springcloud.model.entity.Duty;
import com.axiuj.springcloud.model.service.DutyFeignService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @创建人 axiuj
 * @创建时间 2019/2/1
 * @描述
 */
@Component
public class DutyFeignServiceHystrix implements FallbackFactory<DutyFeignService> {
    @Override
    public DutyFeignService create(Throwable throwable) {
        return new DutyFeignService() {
            @Override
            public List<Duty> list() {
                return null;
            }

            @Override
            public int delete(long dutyId) {
                return 0;
            }

            @Override
            public Duty get(long dutyId) {
                return null;
            }

            @Override
            public int add(Duty duty) {
                return 0;
            }

            @Override
            public int updata(Duty duty) {
                return 0;
            }
        };
    }
}

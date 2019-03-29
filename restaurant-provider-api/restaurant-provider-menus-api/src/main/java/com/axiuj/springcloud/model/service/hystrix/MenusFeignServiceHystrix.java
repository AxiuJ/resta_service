package com.axiuj.springcloud.model.service.hystrix;

import com.axiuj.springcloud.model.entity.Menus;
import com.axiuj.springcloud.model.service.MenusFeignService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @创建人 axiuj
 * @创建时间 2019/2/11
 * @描述
 */
@Component
public class MenusFeignServiceHystrix implements FallbackFactory<MenusFeignService> {
    @Override
    public MenusFeignService create(Throwable throwable) {
        return new MenusFeignService() {
            @Override
            public List<Menus> list() {
                return null;
            }

            @Override
            public int delete(Menus menus) {
                return 0;
            }

            @Override
            public Menus get(long menusId) {
                return null;
            }

            @Override
            public int add(Menus menus) {
                return 0;
            }

            @Override
            public int updata(Menus menus) {
                return 0;
            }

            @Override
            public List<Menus> menusList(Menus menus) {
                return null;
            }

            @Override
            public int findbycategory(Menus menus) {
                return 0;
            }
        };
    }
}

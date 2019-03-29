package com.axiuj.springcloud.model.service.hystrix;

import com.axiuj.springcloud.model.entity.Category;
import com.axiuj.springcloud.model.service.CategoryFeignService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * @创建人 axiuj
 * @创建时间 2019/2/7
 * @描述
 */
@Component
public class CategoryFeignServiceHystrix implements FallbackFactory<CategoryFeignService> {
    @Override
    public CategoryFeignService create(Throwable throwable) {
        return new CategoryFeignService() {
            @Override
            public List<Category> list() {
                return null;
            }

            @Override
            public int delete(Category category) {
                return 0;
            }

            @Override
            public Category get(long categoryId) {
                return null;
            }

            @Override
            public int add(Category category) {
                return 0;
            }

            @Override
            public int updata(Category category) {
                return 0;
            }

            @Override
            public List<Category> findbyname(Category category) {
                return null;
            }

            @Override
            public int updateusble(Category category) {
                return 0;
            }
        };
    }
}

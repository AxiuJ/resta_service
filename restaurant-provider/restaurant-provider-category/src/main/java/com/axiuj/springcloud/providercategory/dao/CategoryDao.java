package com.axiuj.springcloud.providercategory.dao;

import com.axiuj.springcloud.model.entity.Category;
import org.apache.ibatis.annotations.Mapper;

import java.util.Collection;
import java.util.List;

/**
 * @创建人 axiuj
 * @创建时间 2019/2/7
 * @描述
 */
@Mapper
public interface CategoryDao {

    public List<Category> list();

    public int delete(Category category);

    public Category get(Integer categoryId);

    public int add(Category category);

    public int updata(Category category);

    List<Category> findbyname(Category category);

    public int updateusble(Category category);
}

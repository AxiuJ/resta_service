package com.axiuj.springcloud.providerstore.dao;

import com.axiuj.springcloud.model.entity.Store;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author
 * @创建人 axiuj
 * @创建时间 2019/1/14
 * @描述
 */
@Mapper
public interface StoreDao {
    /**
     * 查询全部数据
     *
     * @return
     */
    public List<Store> list();

    /**
     * 查询一条数据
     *
     * @param storeid
     * @return
     */
    public Store get(long storeId);

    /**
     * 删除数据库一条数据
     *
     * @param storeId
     * @return
     */
    public int delete(int storeId);

    /**
     * 更新数据库数据
     *
     * @param store
     * @return
     */
    public int updata(Store store);

    /**
     * @param store
     * @return
     */
    public int add(Store store);

    public Store get(Store store);
}

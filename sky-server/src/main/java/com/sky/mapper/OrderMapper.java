package com.sky.mapper;

import com.sky.entity.Orders;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper {
    /**
     * 插入1条订单数据
     * @param orders
     */
    public void insert(Orders orders);
}

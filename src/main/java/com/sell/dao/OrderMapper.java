package com.sell.dao;

import com.sell.pojo.Order;

import java.util.List;

public interface OrderMapper {
    int deleteByPrimaryKey(String orderId);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(String orderId);

    List<Order> selectByUserId(int userId);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);
}